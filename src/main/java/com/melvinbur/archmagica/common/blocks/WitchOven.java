package com.melvinbur.archmagica.common.blocks;

import java.util.Random;

import java.util.stream.Stream;

import javax.annotation.Nullable;

import com.melvinbur.archmagica.common.te.WitchOvenTileEntity;
import com.melvinbur.archmagica.core.init.TileEntityTypesInit;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraftforge.fml.network.NetworkHooks;


public class WitchOven extends Block {


	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;

	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(0.8000000000000007, 2, 0.5, 14.8, 2.45, 14.5),
			Block.makeCuboidShape(13.1, 3.2, 0.875, 13.5, 11.2, 1.4000000000000004),
			Block.makeCuboidShape(2.0999999999999996, 3.25, 0.875, 2.5, 11.2, 1.424999999999999),
			Block.makeCuboidShape(11.45, 3.825, 0.875, 11.85, 10.45, 1.299999999999999),
			Block.makeCuboidShape(2.2624999999999993, 10.4375, 0.875, 13.2375, 11.2125, 1.299999999999999),
			Block.makeCuboidShape(2.2624999999999993, 3.2125, 0.875, 13.2375, 3.9875, 1.049999999999999),
			Block.makeCuboidShape(9.6, 3.875, 0.875, 10.3, 10.45, 1.299999999999999),
			Block.makeCuboidShape(8.25, 3.775, 0.875, 8.65, 10.75, 1.299999999999999),
			Block.makeCuboidShape(6.6, 3.925, 0.875, 7.325000000000001, 10.725, 1.299999999999999),
			Block.makeCuboidShape(4.949999999999999, 3.925, 0.875, 5.35, 10.6, 1.299999999999999),
			Block.makeCuboidShape(3.5999999999999996, 3.85, 0.875, 4, 10.525, 1.299999999999999),
			Block.makeCuboidShape(1.9000000000000004, 0.025, 1.9999999999999982, 3, 2.025, 2.9749999999999996),
			Block.makeCuboidShape(13, 0.025, 1.9999999999999982, 14.1, 2.025, 2.9749999999999996),
			Block.makeCuboidShape(13, 0.025, 13.024999999999999, 14.1, 2.025, 14),
			Block.makeCuboidShape(1.9000000000000004, 0.025, 13.024999999999999, 3, 2.025, 14),
			Block.makeCuboidShape(8.8, 13.325, 9.175, 9.1, 23.275, 9.475),
			Block.makeCuboidShape(6.525, 13.325, 9.175, 6.824999999999999, 23.225, 9.475),
			Block.makeCuboidShape(6.25, 23.175, 6.225, 9.425, 23.35, 9.7),
			Block.makeCuboidShape(6.75, 23.375, 6.825000000000001, 8.925, 23.55, 9.2),
			Block.makeCuboidShape(6.525, 13.325, 6.475, 6.824999999999999, 23.225, 6.775),
			Block.makeCuboidShape(6.824999999999999, 13.325, 6.575000000000001, 8.825, 22.55, 6.700000000000001),
			Block.makeCuboidShape(6.824999999999999, 13.325, 9.275, 8.825, 22.575, 9.4),
			Block.makeCuboidShape(6.65, 13.325, 6.775, 6.775, 22.5, 9.175),
			Block.makeCuboidShape(8.95, 13.325, 6.775, 9.075, 22.475, 9.175),
			Block.makeCuboidShape(8.825, 13.325, 6.475, 9.125, 23.3, 6.775),
			Block.makeCuboidShape(0.8000000000000007, 12.5, 0.5, 14.8, 12.95, 14.5),
			Block.makeCuboidShape(1.9000000000000004, 13, 1.5999999999999996, 13.8, 13.35, 13.4),
			Block.makeCuboidShape(1.5999999999999996, 2.5, 1.5, 14, 12.5, 13.825),
			Block.makeCuboidShape(2.125, 3.575, 1.075000000000001, 13.25, 10.975, 1.200000000000001)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(1.5125000000000006, 2, 0.837500000000001, 15.512499999999998, 2.45, 14.837500000000002),
			Block.makeCuboidShape(14.612499999999997, 3.2, 13.137500000000001, 15.137499999999998, 11.2, 13.537500000000001),
			Block.makeCuboidShape(14.587499999999999, 3.25, 2.1374999999999997, 15.137499999999998, 11.2, 2.5375),
			Block.makeCuboidShape(14.712499999999999, 3.825, 11.4875, 15.137499999999998, 10.45, 11.887500000000001),
			Block.makeCuboidShape(14.712499999999999, 10.4375, 2.2999999999999994, 15.137499999999998, 11.2125, 13.275000000000002),
			Block.makeCuboidShape(14.962499999999999, 3.2125, 2.2999999999999994, 15.137499999999998, 3.9875, 13.275000000000002),
			Block.makeCuboidShape(14.712499999999999, 3.875, 9.637500000000001, 15.137499999999998, 10.45, 10.337500000000002),
			Block.makeCuboidShape(14.712499999999999, 3.775, 8.287500000000001, 15.137499999999998, 10.75, 8.687500000000002),
			Block.makeCuboidShape(14.712499999999999, 3.925, 6.637500000000001, 15.137499999999998, 10.725, 7.3625000000000025),
			Block.makeCuboidShape(14.712499999999999, 3.925, 4.987500000000001, 15.137499999999998, 10.6, 5.387500000000001),
			Block.makeCuboidShape(14.712499999999999, 3.85, 3.6374999999999997, 15.137499999999998, 10.525, 4.037500000000001),
			Block.makeCuboidShape(13.037499999999998, 0.025, 1.9375000000000004, 14.0125, 2.025, 3.0375),
			Block.makeCuboidShape(13.037499999999998, 0.025, 13.037500000000001, 14.0125, 2.025, 14.137500000000001),
			Block.makeCuboidShape(2.012500000000001, 0.025, 13.037500000000001, 2.9875000000000025, 2.025, 14.137500000000001),
			Block.makeCuboidShape(2.012500000000001, 0.025, 1.9375000000000004, 2.9875000000000025, 2.025, 3.0375),
			Block.makeCuboidShape(6.537499999999998, 13.325, 8.837500000000002, 6.837499999999997, 23.275, 9.137500000000001),
			Block.makeCuboidShape(6.537499999999998, 13.325, 6.562500000000002, 6.837499999999997, 23.225, 6.862500000000001),
			Block.makeCuboidShape(6.312499999999998, 23.175, 6.287500000000001, 9.787499999999998, 23.35, 9.462500000000002),
			Block.makeCuboidShape(6.812499999999998, 23.375, 6.787500000000001, 9.187499999999996, 23.55, 8.962500000000002),
			Block.makeCuboidShape(9.237499999999997, 13.325, 6.562500000000002, 9.537499999999998, 23.225, 6.862500000000001),
			Block.makeCuboidShape(9.312499999999996, 13.325, 6.862500000000001, 9.437499999999996, 22.55, 8.8625),
			Block.makeCuboidShape(6.612499999999997, 13.325, 6.862500000000001, 6.737499999999997, 22.575, 8.8625),
			Block.makeCuboidShape(6.837499999999997, 13.325, 6.687500000000002, 9.237499999999997, 22.5, 6.812500000000002),
			Block.makeCuboidShape(6.837499999999997, 13.325, 8.9875, 9.237499999999997, 22.475, 9.1125),
			Block.makeCuboidShape(9.237499999999997, 13.325, 8.8625, 9.537499999999998, 23.3, 9.162500000000001),
			Block.makeCuboidShape(1.5125000000000006, 12.5, 0.837500000000001, 15.512499999999998, 12.95, 14.837500000000002),
			Block.makeCuboidShape(2.6125000000000007, 13, 1.9375000000000004, 14.412499999999998, 13.35, 13.837500000000002),
			Block.makeCuboidShape(2.1875000000000018, 2.5, 1.6374999999999997, 14.512499999999998, 12.5, 14.037500000000001),
			Block.makeCuboidShape(14.812499999999996, 3.575, 2.1625, 14.937499999999996, 10.975, 13.287500000000001)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(0.46250000000000113, 2, 1.237499999999999, 14.462499999999997, 2.45, 15.237499999999995),
			Block.makeCuboidShape(0.8375000000000011, 3.2, 2.5375000000000005, 1.3625000000000016, 11.2, 2.937500000000001),
			Block.makeCuboidShape(0.8375000000000011, 3.25, 13.537499999999996, 1.3875000000000002, 11.2, 13.937499999999996),
			Block.makeCuboidShape(0.8375000000000011, 3.825, 4.187499999999998, 1.2625000000000002, 10.45, 4.587499999999998),
			Block.makeCuboidShape(0.8375000000000011, 10.4375, 2.8, 1.2625000000000002, 11.2125, 13.774999999999997),
			Block.makeCuboidShape(0.8375000000000011, 3.2125, 2.8, 1.0124999999999997, 3.9875, 13.774999999999997),
			Block.makeCuboidShape(0.8375000000000011, 3.875, 5.7374999999999945, 1.2625000000000002, 10.45, 6.437499999999996),
			Block.makeCuboidShape(0.8375000000000011, 3.775, 7.387499999999995, 1.2625000000000002, 10.75, 7.787499999999994),
			Block.makeCuboidShape(0.8375000000000011, 3.925, 8.712499999999993, 1.2625000000000002, 10.725, 9.437499999999995),
			Block.makeCuboidShape(0.8375000000000011, 3.925, 10.687499999999995, 1.2625000000000002, 10.6, 11.087499999999995),
			Block.makeCuboidShape(0.8375000000000011, 3.85, 12.037499999999994, 1.2625000000000002, 10.525, 12.437499999999996),
			Block.makeCuboidShape(1.9625, 0.025, 13.037499999999996, 2.9375000000000013, 2.025, 14.137499999999996),
			Block.makeCuboidShape(1.9625, 0.025, 1.9375000000000009, 2.9375000000000013, 2.025, 3.0375000000000005),
			Block.makeCuboidShape(12.987499999999995, 0.025, 1.9375000000000009, 13.962499999999997, 2.025, 3.0375000000000005),
			Block.makeCuboidShape(12.987499999999995, 0.025, 13.037499999999996, 13.962499999999997, 2.025, 14.137499999999996),
			Block.makeCuboidShape(9.1375, 13.325, 6.937499999999996, 9.437499999999998, 23.275, 7.2374999999999945),
			Block.makeCuboidShape(9.1375, 13.325, 9.212499999999995, 9.437499999999998, 23.225, 9.512499999999994),
			Block.makeCuboidShape(6.187499999999998, 23.175, 6.6124999999999945, 9.662499999999998, 23.35, 9.787499999999994),
			Block.makeCuboidShape(6.7875, 23.375, 7.1124999999999945, 9.162499999999998, 23.55, 9.287499999999994),
			Block.makeCuboidShape(6.437499999999998, 13.325, 9.212499999999995, 6.737499999999999, 23.225, 9.512499999999994),
			Block.makeCuboidShape(6.5375, 13.325, 7.212499999999996, 6.6625, 22.55, 9.212499999999995),
			Block.makeCuboidShape(9.237499999999999, 13.325, 7.212499999999996, 9.362499999999999, 22.575, 9.212499999999995),
			Block.makeCuboidShape(6.737499999999999, 13.325, 9.262499999999994, 9.1375, 22.5, 9.387499999999994),
			Block.makeCuboidShape(6.737499999999999, 13.325, 6.962499999999996, 9.1375, 22.475, 7.087499999999996),
			Block.makeCuboidShape(6.437499999999998, 13.325, 6.912499999999995, 6.737499999999999, 23.3, 7.212499999999996),
			Block.makeCuboidShape(0.46250000000000113, 12.5, 1.237499999999999, 14.462499999999997, 12.95, 15.237499999999995),
			Block.makeCuboidShape(1.5625000000000009, 13, 2.2375, 13.362499999999997, 13.35, 14.137499999999996),
			Block.makeCuboidShape(1.4625000000000012, 2.5, 2.0375000000000005, 13.787499999999996, 12.5, 14.437499999999996),
			Block.makeCuboidShape(1.0375000000000019, 3.575, 2.7875000000000005, 1.1625000000000023, 10.975, 13.912499999999996)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(1.1999999999999986, 2, 1.450000000000001, 15.199999999999996, 2.45, 15.45),
			Block.makeCuboidShape(2.5, 3.2, 14.549999999999999, 2.9000000000000004, 11.2, 15.075),
			Block.makeCuboidShape(13.499999999999996, 3.25, 14.525, 13.899999999999997, 11.2, 15.075),
			Block.makeCuboidShape(4.149999999999999, 3.825, 14.65, 4.549999999999998, 10.45, 15.075),
			Block.makeCuboidShape(2.7624999999999993, 10.4375, 14.65, 13.737499999999997, 11.2125, 15.075),
			Block.makeCuboidShape(2.7624999999999993, 3.2125, 14.9, 13.737499999999997, 3.9875, 15.075),
			Block.makeCuboidShape(5.699999999999995, 3.875, 14.65, 6.399999999999996, 10.45, 15.075),
			Block.makeCuboidShape(7.349999999999995, 3.775, 14.65, 7.749999999999996, 10.75, 15.075),
			Block.makeCuboidShape(8.674999999999994, 3.925, 14.65, 9.399999999999995, 10.725, 15.075),
			Block.makeCuboidShape(10.649999999999995, 3.925, 14.65, 11.049999999999995, 10.6, 15.075),
			Block.makeCuboidShape(11.999999999999995, 3.85, 14.65, 12.399999999999997, 10.525, 15.075),
			Block.makeCuboidShape(12.999999999999996, 0.025, 12.975, 14.099999999999996, 2.025, 13.950000000000001),
			Block.makeCuboidShape(1.9000000000000001, 0.025, 12.975, 3, 2.025, 13.950000000000001),
			Block.makeCuboidShape(1.9000000000000001, 0.025, 1.950000000000001, 3, 2.025, 2.9250000000000025),
			Block.makeCuboidShape(12.999999999999996, 0.025, 1.950000000000001, 14.099999999999996, 2.025, 2.9250000000000025),
			Block.makeCuboidShape(6.899999999999996, 13.325, 6.475, 7.199999999999995, 23.275, 6.774999999999999),
			Block.makeCuboidShape(9.174999999999995, 13.325, 6.475, 9.474999999999994, 23.225, 6.774999999999999),
			Block.makeCuboidShape(6.574999999999995, 23.175, 6.25, 9.749999999999995, 23.35, 9.725),
			Block.makeCuboidShape(7.074999999999995, 23.375, 6.75, 9.249999999999995, 23.55, 9.124999999999998),
			Block.makeCuboidShape(9.174999999999995, 13.325, 9.174999999999999, 9.474999999999994, 23.225, 9.475),
			Block.makeCuboidShape(7.174999999999996, 13.325, 9.249999999999998, 9.174999999999995, 22.55, 9.374999999999998),
			Block.makeCuboidShape(7.174999999999996, 13.325, 6.549999999999999, 9.174999999999995, 22.575, 6.674999999999999),
			Block.makeCuboidShape(9.224999999999994, 13.325, 6.774999999999999, 9.349999999999994, 22.5, 9.174999999999999),
			Block.makeCuboidShape(6.924999999999996, 13.325, 6.774999999999999, 7.049999999999996, 22.475, 9.174999999999999),
			Block.makeCuboidShape(6.874999999999996, 13.325, 9.174999999999999, 7.174999999999996, 23.3, 9.475),
			Block.makeCuboidShape(1.1999999999999986, 12.5, 1.450000000000001, 15.199999999999996, 12.95, 15.45),
			Block.makeCuboidShape(2.1999999999999993, 13, 2.5500000000000007, 14.099999999999996, 13.35, 14.35),
			Block.makeCuboidShape(1.9999999999999998, 2.5, 2.1250000000000018, 14.399999999999997, 12.5, 14.45),
			Block.makeCuboidShape(2.75, 3.575, 14.749999999999998, 13.874999999999996, 10.975, 14.874999999999998)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public WitchOven() {
        super(
        Block.Properties.create(Material.ANVIL, MaterialColor.GRAY).
        hardnessAndResistance(5F, 6F).
        setRequiresTool().
        harvestTool(ToolType.PICKAXE).
        sound(SoundType.ANVIL));
        
        
    }
	
	
	
	
	public WitchOven(Properties properties) 
	{
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(LIT, false));
	}
	@Nullable 
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) 
	{
		if (stateIn.get(LIT)) 
		{
			double x = pos.getX() + 0.5D;
			double y = pos.getY();
			double z = pos.getZ() + 0.5D;
			if (rand.nextDouble() < 0.1D) 
			{
			   worldIn.playSound(x, y, z, SoundEvents.BLOCK_BLASTFURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			}

			Direction direction = (Direction)stateIn.get(FACING);
			Direction.Axis axis = direction.getAxis();
			double defOffset = rand.nextDouble() * 0.6D - 0.3D;
			double offX = axis == Direction.Axis.X ? direction.getXOffset() * 0.52D : defOffset;
			double offY = rand.nextDouble() * 9.0D / 16.0D;
			double offZ = axis == Direction.Axis.Z ? direction.getZOffset() * 0.52D : defOffset;
			worldIn.addParticle(ParticleTypes.SMOKE, x + offX, y + offY, z + offZ, 0.0D, 0.0D, 0.0D);
		}
	}
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit)
	{
		if (worldIn.isRemote) 
		{
			return ActionResultType.SUCCESS;
		} 
		else
		{
			this.interactWith(worldIn, pos, player);
			return ActionResultType.CONSUME;
		}
	}
	
	protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) 
	{
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity instanceof WitchOvenTileEntity) 
		{
			NetworkHooks.openGui((ServerPlayerEntity)player, (WitchOvenTileEntity)tileEntity);
		}
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) 
	{
		if (!state.isIn(newState.getBlock())) 
		{
			TileEntity tileentity = worldIn.getTileEntity(pos);
	        if (tileentity instanceof WitchOvenTileEntity) 
	        {
	        	InventoryHelper.dropInventoryItems(worldIn, pos, (WitchOvenTileEntity)tileentity);
	             //((WitchOvenTileEntity)tileentity).grantStoredRecipeExperience(worldIn, Vector3d.copyCentered(pos));
	             worldIn.updateComparatorOutputLevel(pos, this);
	          }

	          super.onReplaced(state, worldIn, pos, newState, isMoving);
	       }
	}
	
	
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }
    
    @Override
	public boolean hasTileEntity(BlockState state) 
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
		return TileEntityTypesInit.WITCH_OVEN.get().create();
	}
	
	@Override
	public boolean hasComparatorInputOverride(BlockState state) 
	{
		return true;
	}
	
	@Override
	public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos) 
	{
		return Container.calcRedstone(worldIn.getTileEntity(pos));
	}

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @SuppressWarnings("deprecation")
	@Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /**Change the block shadow -- Lower return values = more shadow*/
    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6F;
    }
}

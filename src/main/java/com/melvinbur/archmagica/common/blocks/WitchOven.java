package com.melvinbur.archmagica.common.blocks;

import java.util.stream.Stream;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

import net.minecraft.state.properties.BlockStateProperties;



import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;

import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import net.minecraftforge.common.ToolType;


public class WitchOven extends Block {


	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(0.8, 2, 0.5, 14.8, 2.45, 14.5),
			Block.makeCuboidShape(13, 0.025, 12.8, 13.9, 2.025, 13.5),
			Block.makeCuboidShape(13.1, 0.025, 1.8, 14, 2.025, 2.5),
			Block.makeCuboidShape(13.1, 3.2, 0.875, 13.5, 11.2, 1.4),
			Block.makeCuboidShape(2.1, 3.25, 0.875, 2.5, 11.2, 1.425),
			Block.makeCuboidShape(11.45, 3.825, 0.875, 11.85, 10.45, 1.3),
			Block.makeCuboidShape(2.2625, 10.4375, 0.875, 13.2375, 11.2125, 1.3),
			Block.makeCuboidShape(2.2625, 3.2125, 0.875, 13.2375, 3.9875, 1.05),
			Block.makeCuboidShape(9.6, 3.875, 0.875, 10.3, 10.45, 1.3),
			Block.makeCuboidShape(8.25, 3.775, 0.875, 8.65, 10.75, 1.3),
			Block.makeCuboidShape(6.6, 3.925, 0.875, 7.325, 10.725, 1.3),
			Block.makeCuboidShape(4.95, 3.925, 0.875, 5.35, 10.6, 1.3),
			Block.makeCuboidShape(3.6, 3.85, 0.875, 4, 10.525, 1.3),
			Block.makeCuboidShape(1.9, 0.025, 1.8, 2.8, 2.025, 2.5),
			Block.makeCuboidShape(8.8, 13.325, 9.175, 9.1, 23.275, 9.475),
			Block.makeCuboidShape(6.525, 13.325, 9.175, 6.825, 23.225, 9.475),
			Block.makeCuboidShape(6.25, 23.175, 6.225, 9.425, 23.35, 9.7),
			Block.makeCuboidShape(6.75, 23.375, 6.825, 8.925, 23.55, 9.2),
			Block.makeCuboidShape(6.525, 13.325, 6.475, 6.825, 23.225, 6.775),
			Block.makeCuboidShape(6.825, 13.325, 6.575, 8.825, 22.55, 6.7),
			Block.makeCuboidShape(6.825, 13.325, 9.275, 8.825, 22.575, 9.4),
			Block.makeCuboidShape(6.65, 13.325, 6.775, 6.775, 22.5, 9.175),
			Block.makeCuboidShape(8.95, 13.325, 6.775, 9.075, 22.475, 9.175),
			Block.makeCuboidShape(8.825, 13.325, 6.475, 9.125, 23.3, 6.775),
			Block.makeCuboidShape(1.9, 0.025, 12.6, 2.8, 2.025, 13.3),
			Block.makeCuboidShape(0.8, 12.5, 0.5, 14.8, 12.95, 14.5),
			Block.makeCuboidShape(1.9, 13, 1.6, 13.8, 13.35, 13.4),
			Block.makeCuboidShape(1.6, 2.5, 1.5, 14, 12.5, 13.825),
			Block.makeCuboidShape(2.125, 3.575, 1.075, 13.25, 10.975, 1.2)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(1.1624999999999996, 2, 1.5874999999999995, 15.1625, 2.45, 15.5875),
			Block.makeCuboidShape(2.1624999999999996, 0.025, 13.7875, 2.862499999999999, 2.025, 14.6875),
			Block.makeCuboidShape(13.1625, 0.025, 13.8875, 13.8625, 2.025, 14.7875),
			Block.makeCuboidShape(14.2625, 3.2, 13.8875, 14.7875, 11.2, 14.2875),
			Block.makeCuboidShape(14.2375, 3.25, 2.8874999999999993, 14.7875, 11.2, 3.2874999999999996),
			Block.makeCuboidShape(14.3625, 3.825, 12.237499999999999, 14.7875, 10.45, 12.6375),
			Block.makeCuboidShape(14.3625, 10.4375, 3.05, 14.7875, 11.2125, 14.025),
			Block.makeCuboidShape(14.6125, 3.2125, 3.05, 14.7875, 3.9875, 14.025),
			Block.makeCuboidShape(14.3625, 3.875, 10.3875, 14.7875, 10.45, 11.0875),
			Block.makeCuboidShape(14.3625, 3.775, 9.0375, 14.7875, 10.75, 9.4375),
			Block.makeCuboidShape(14.3625, 3.925, 7.387499999999999, 14.7875, 10.725, 8.1125),
			Block.makeCuboidShape(14.3625, 3.925, 5.7375, 14.7875, 10.6, 6.137499999999999),
			Block.makeCuboidShape(14.3625, 3.85, 4.387499999999999, 14.7875, 10.525, 4.7875),
			Block.makeCuboidShape(13.1625, 0.025, 2.6875, 13.8625, 2.025, 3.5874999999999995),
			Block.makeCuboidShape(6.1875, 13.325, 9.5875, 6.487499999999999, 23.275, 9.8875),
			Block.makeCuboidShape(6.1875, 13.325, 7.3125, 6.487499999999999, 23.225, 7.6125),
			Block.makeCuboidShape(5.9625, 23.175, 7.0375, 9.4375, 23.35, 10.2125),
			Block.makeCuboidShape(6.4625, 23.375, 7.5375, 8.837499999999999, 23.55, 9.7125),
			Block.makeCuboidShape(8.8875, 13.325, 7.3125, 9.1875, 23.225, 7.6125),
			Block.makeCuboidShape(8.962499999999999, 13.325, 7.6125, 9.087499999999999, 22.55, 9.612499999999999),
			Block.makeCuboidShape(6.262499999999999, 13.325, 7.6125, 6.387499999999999, 22.575, 9.612499999999999),
			Block.makeCuboidShape(6.487499999999999, 13.325, 7.4375, 8.8875, 22.5, 7.5625),
			Block.makeCuboidShape(6.487499999999999, 13.325, 9.737499999999999, 8.8875, 22.475, 9.862499999999999),
			Block.makeCuboidShape(8.8875, 13.325, 9.612499999999999, 9.1875, 23.3, 9.9125),
			Block.makeCuboidShape(2.362499999999999, 0.025, 2.6875, 3.0625, 2.025, 3.5874999999999995),
			Block.makeCuboidShape(1.1624999999999996, 12.5, 1.5874999999999995, 15.1625, 12.95, 15.5875),
			Block.makeCuboidShape(2.2624999999999993, 13, 2.6875, 14.0625, 13.35, 14.5875),
			Block.makeCuboidShape(1.8375000000000004, 2.5, 2.3874999999999993, 14.1625, 12.5, 14.7875),
			Block.makeCuboidShape(14.462499999999999, 3.575, 2.9124999999999996, 14.587499999999999, 10.975, 14.0375)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(-0.28749999999999964, 2, 0.8624999999999989, 13.7125, 2.45, 14.862499999999999),
			Block.makeCuboidShape(12.012500000000001, 0.025, 1.7624999999999993, 12.7125, 2.025, 2.6624999999999996),
			Block.makeCuboidShape(1.0124999999999993, 0.025, 1.6624999999999996, 1.7125000000000004, 2.025, 2.5625),
			Block.makeCuboidShape(0.08750000000000036, 3.2, 2.1624999999999996, 0.6125000000000007, 11.2, 2.5625),
			Block.makeCuboidShape(0.08750000000000036, 3.25, 13.1625, 0.6374999999999993, 11.2, 13.5625),
			Block.makeCuboidShape(0.08750000000000036, 3.825, 3.8125, 0.5124999999999993, 10.45, 4.2125),
			Block.makeCuboidShape(0.08750000000000036, 10.4375, 2.424999999999999, 0.5124999999999993, 11.2125, 13.4),
			Block.makeCuboidShape(0.08750000000000036, 3.2125, 2.424999999999999, 0.2624999999999993, 3.9875, 13.4),
			Block.makeCuboidShape(0.08750000000000036, 3.875, 5.362499999999999, 0.5124999999999993, 10.45, 6.0625),
			Block.makeCuboidShape(0.08750000000000036, 3.775, 7.012499999999999, 0.5124999999999993, 10.75, 7.4125),
			Block.makeCuboidShape(0.08750000000000036, 3.925, 8.337499999999999, 0.5124999999999993, 10.725, 9.0625),
			Block.makeCuboidShape(0.08750000000000036, 3.925, 10.3125, 0.5124999999999993, 10.6, 10.7125),
			Block.makeCuboidShape(0.08750000000000036, 3.85, 11.6625, 0.5124999999999993, 10.525, 12.0625),
			Block.makeCuboidShape(1.0124999999999993, 0.025, 12.862499999999999, 1.7125000000000004, 2.025, 13.7625),
			Block.makeCuboidShape(8.387500000000001, 13.325, 6.5625, 8.6875, 23.275, 6.862499999999999),
			Block.makeCuboidShape(8.387500000000001, 13.325, 8.8375, 8.6875, 23.225, 9.1375),
			Block.makeCuboidShape(5.4375, 23.175, 6.237499999999999, 8.9125, 23.35, 9.4125),
			Block.makeCuboidShape(6.037500000000001, 23.375, 6.737499999999999, 8.4125, 23.55, 8.9125),
			Block.makeCuboidShape(5.6875, 13.325, 8.8375, 5.987500000000001, 23.225, 9.1375),
			Block.makeCuboidShape(5.787500000000001, 13.325, 6.8375, 5.912500000000001, 22.55, 8.8375),
			Block.makeCuboidShape(8.4875, 13.325, 6.8375, 8.6125, 22.575, 8.8375),
			Block.makeCuboidShape(5.987500000000001, 13.325, 8.8875, 8.387500000000001, 22.5, 9.0125),
			Block.makeCuboidShape(5.987500000000001, 13.325, 6.5875, 8.387500000000001, 22.475, 6.7125),
			Block.makeCuboidShape(5.6875, 13.325, 6.5375, 5.987500000000001, 23.3, 6.8375),
			Block.makeCuboidShape(11.8125, 0.025, 12.862499999999999, 12.512500000000001, 2.025, 13.7625),
			Block.makeCuboidShape(-0.28749999999999964, 12.5, 0.8624999999999989, 13.7125, 12.95, 14.862499999999999),
			Block.makeCuboidShape(0.8125, 13, 1.862499999999999, 12.6125, 13.35, 13.7625),
			Block.makeCuboidShape(0.7125000000000004, 2.5, 1.6624999999999996, 13.0375, 12.5, 14.0625),
			Block.makeCuboidShape(0.2875000000000014, 3.575, 2.4124999999999996, 0.4125000000000014, 10.975, 13.5375)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(0.07499999999999929, 2, 1.9499999999999993, 14.075, 2.45, 15.95),
			Block.makeCuboidShape(0.9749999999999996, 0.025, 2.9499999999999993, 1.875, 2.025, 3.6499999999999986),
			Block.makeCuboidShape(0.875, 0.025, 13.95, 1.7750000000000004, 2.025, 14.65),
			Block.makeCuboidShape(1.375, 3.2, 15.049999999999999, 1.7750000000000004, 11.2, 15.575),
			Block.makeCuboidShape(12.375, 3.25, 15.025, 12.775, 11.2, 15.575),
			Block.makeCuboidShape(3.0250000000000004, 3.825, 15.15, 3.4250000000000007, 10.45, 15.575),
			Block.makeCuboidShape(1.6374999999999993, 10.4375, 15.15, 12.6125, 11.2125, 15.575),
			Block.makeCuboidShape(1.6374999999999993, 3.2125, 15.4, 12.6125, 3.9875, 15.575),
			Block.makeCuboidShape(4.574999999999999, 3.875, 15.15, 5.275, 10.45, 15.575),
			Block.makeCuboidShape(6.225, 3.775, 15.15, 6.625, 10.75, 15.575),
			Block.makeCuboidShape(7.549999999999999, 3.925, 15.15, 8.275, 10.725, 15.575),
			Block.makeCuboidShape(9.525, 3.925, 15.15, 9.925, 10.6, 15.575),
			Block.makeCuboidShape(10.875, 3.85, 15.15, 11.275, 10.525, 15.575),
			Block.makeCuboidShape(12.075, 0.025, 13.95, 12.975, 2.025, 14.65),
			Block.makeCuboidShape(5.775, 13.325, 6.975, 6.074999999999999, 23.275, 7.274999999999999),
			Block.makeCuboidShape(8.05, 13.325, 6.975, 8.35, 23.225, 7.274999999999999),
			Block.makeCuboidShape(5.449999999999999, 23.175, 6.75, 8.625, 23.35, 10.225),
			Block.makeCuboidShape(5.949999999999999, 23.375, 7.25, 8.125, 23.55, 9.624999999999998),
			Block.makeCuboidShape(8.05, 13.325, 9.674999999999999, 8.35, 23.225, 9.975),
			Block.makeCuboidShape(6.050000000000001, 13.325, 9.749999999999998, 8.05, 22.55, 9.874999999999998),
			Block.makeCuboidShape(6.050000000000001, 13.325, 7.049999999999999, 8.05, 22.575, 7.174999999999999),
			Block.makeCuboidShape(8.1, 13.325, 7.274999999999999, 8.225, 22.5, 9.674999999999999),
			Block.makeCuboidShape(5.800000000000001, 13.325, 7.274999999999999, 5.925000000000001, 22.475, 9.674999999999999),
			Block.makeCuboidShape(5.75, 13.325, 9.674999999999999, 6.050000000000001, 23.3, 9.975),
			Block.makeCuboidShape(12.075, 0.025, 3.1499999999999986, 12.975, 2.025, 3.8499999999999996),
			Block.makeCuboidShape(0.07499999999999929, 12.5, 1.9499999999999993, 14.075, 12.95, 15.95),
			Block.makeCuboidShape(1.0749999999999993, 13, 3.049999999999999, 12.975, 13.35, 14.85),
			Block.makeCuboidShape(0.875, 2.5, 2.625, 13.275, 12.5, 14.95),
			Block.makeCuboidShape(1.625, 3.575, 15.249999999999998, 12.75, 10.975, 15.374999999999998)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public WitchOven() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.5F, 4.0F)
                .sound(SoundType.ANVIL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
	@Nullable 
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
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

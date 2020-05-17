package com.ryanasaurus.ryanmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.ryanasaurus.ryanmod.RyanMod;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class ModCommands {

    public static void register (CommandDispatcher<CommandSource> dispatcher) {
        LiteralCommandNode<CommandSource> ryanCommand = dispatcher.register(
                Commands.literal(RyanMod.MODID)
                        .then(CommandTest.register(dispatcher))
                        .then(CommandTpDim.register(dispatcher))
                        .then(CommandSpawner.register(dispatcher))
        );
    }

}

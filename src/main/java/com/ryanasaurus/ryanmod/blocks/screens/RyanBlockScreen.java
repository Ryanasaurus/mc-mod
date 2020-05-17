package com.ryanasaurus.ryanmod.blocks.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import com.ryanasaurus.ryanmod.RyanMod;
import com.ryanasaurus.ryanmod.blocks.container.RyanBlockContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class RyanBlockScreen extends ContainerScreen<RyanBlockContainer> {

    private ResourceLocation GUI = new ResourceLocation(RyanMod.MODID, "textures/gui/ryanblock_gui.png");

    public RyanBlockScreen(RyanBlockContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
    }

    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.font.drawString(this.title.getFormattedText(), 8.0F, 6.0F, 4210752);
        this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0F, (float)(this.ySize - 110), 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);
    }
}

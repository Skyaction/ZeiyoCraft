package net.minecraft.client.model;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelLeashKnot extends ModelBase
{
    public ModelRenderer field_110723_a;

    public ModelLeashKnot()
    {
        this(0, 0, 32, 32);
    }

    public ModelLeashKnot(int p_i46365_1_, int p_i46365_2_, int p_i46365_3_, int p_i46365_4_)
    {
        this.textureWidth = p_i46365_3_;
        this.textureHeight = p_i46365_4_;
        this.field_110723_a = new ModelRenderer(this, p_i46365_1_, p_i46365_2_);
        this.field_110723_a.addBox(-3.0F, -6.0F, -3.0F, 6, 8, 6, 0.0F);
        this.field_110723_a.setRotationPoint(0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entityIn, float p_78088_2_, float limbSwing, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.setRotationAngles(p_78088_2_, limbSwing, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.field_110723_a.render(scale);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        this.field_110723_a.rotateAngleY = netHeadYaw * 0.017453292F;
        this.field_110723_a.rotateAngleX = headPitch * 0.017453292F;
    }
}
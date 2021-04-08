package plum.pawprints.entity.model.butterfly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ModelPaperKiteButterfly extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer butt;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer headplaneright;
	private final ModelRenderer headplaneleft;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer tail7;
	private final ModelRenderer footrightback;
	private final ModelRenderer footrightfour;
	private final ModelRenderer footleftfour;
	private final ModelRenderer footrightthree;
	private final ModelRenderer footleftthree;
	private final ModelRenderer footrighttwo;
	private final ModelRenderer footrightone;
	private final ModelRenderer footleftone;
	private final ModelRenderer footleftback;
	private final ModelRenderer footlefttwo;
	private final ModelRenderer butterfly;
	private final ModelRenderer abdomen;
	private final ModelRenderer head2;
	private final ModelRenderer antennae;
	private final ModelRenderer wings;
	private final ModelRenderer wingleft;
	private final ModelRenderer wingright;

	public ModelPaperKiteButterfly() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.7F, 1.1F);
		body.cubeList.add(new ModelBox(body, 15, 5, -1.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F, false));

		butt = new ModelRenderer(this);
		butt.setRotationPoint(0.0F, 0.0F, 1.5F);
		body.addChild(butt);
		setRotationAngle(butt, 0.0349F, 0.0F, 0.0F);
		butt.cubeList.add(new ModelBox(butt, 11, 13, -1.5F, -1.5F, -0.5F, 3, 3, 5, -0.1F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 0.0173F, -1.9986F);
		body.addChild(neck);
		setRotationAngle(neck, -0.0873F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 10, -1.5F, -1.5F, -5.1F, 3, 3, 5, 0.1F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.1071F, -4.6178F);
		neck.addChild(head);
		setRotationAngle(head, 0.384F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 18, -1.5F, -1.5F, -2.7F, 3, 3, 3, -0.3F, false));

		headplaneright = new ModelRenderer(this);
		headplaneright.setRotationPoint(-0.3F, 1.5222F, -0.1517F);
		head.addChild(headplaneright);
		setRotationAngle(headplaneright, -0.1571F, 0.0F, 0.0F);
		headplaneright.cubeList.add(new ModelBox(headplaneright, 0, 26, -1.0F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

		headplaneleft = new ModelRenderer(this);
		headplaneleft.setRotationPoint(0.2F, 1.5222F, -0.1517F);
		head.addChild(headplaneleft);
		setRotationAngle(headplaneleft, -0.1571F, 0.0F, 0.0F);
		headplaneleft.cubeList.add(new ModelBox(headplaneleft, 0, 0, 1.1F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -1.4F, 4.4F);
		body.addChild(tail);
		setRotationAngle(tail, -0.384F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 26, 3, -2.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -1.4F, 2.4F);
		body.addChild(tail2);
		setRotationAngle(tail2, -0.384F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 26, 0, -2.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, -1.4F, 0.4F);
		body.addChild(tail3);
		setRotationAngle(tail3, -0.2094F, 0.0F, 0.0F);
		tail3.cubeList.add(new ModelBox(tail3, 16, 26, -2.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, false));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, -1.3F, -1.7F);
		body.addChild(tail4);
		setRotationAngle(tail4, -0.0873F, 0.0F, 0.0F);
		tail4.cubeList.add(new ModelBox(tail4, 8, 26, -2.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, false));

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(0.0F, -1.3F, -7.5F);
		body.addChild(tail5);
		setRotationAngle(tail5, 0.2793F, 0.0F, 0.0F);
		tail5.cubeList.add(new ModelBox(tail5, 0, 24, -2.0F, -5.0F, 1.0F, 4, 5, 0, 0.0F, false));

		tail6 = new ModelRenderer(this);
		tail6.setRotationPoint(0.0F, -1.0F, -5.9F);
		body.addChild(tail6);
		setRotationAngle(tail6, 0.0524F, 0.0F, 0.0F);
		tail6.cubeList.add(new ModelBox(tail6, 22, 13, -2.0F, -5.0F, 1.0F, 4, 5, 0, 0.0F, false));

		tail7 = new ModelRenderer(this);
		tail7.setRotationPoint(0.0F, -1.0F, -4.0F);
		body.addChild(tail7);
		setRotationAngle(tail7, -0.0349F, 0.0F, 0.0F);
		tail7.cubeList.add(new ModelBox(tail7, 19, 21, -2.0F, -5.007F, 1.1999F, 4, 5, 0, 0.0F, false));

		footrightback = new ModelRenderer(this);
		footrightback.setRotationPoint(-0.15F, 0.2F, 5.4F);
		body.addChild(footrightback);
		setRotationAngle(footrightback, 0.2618F, 0.0F, 0.0F);
		footrightback.cubeList.add(new ModelBox(footrightback, 18, 29, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightfour = new ModelRenderer(this);
		footrightfour.setRotationPoint(-0.15F, 0.4F, 2.4F);
		body.addChild(footrightfour);
		footrightfour.cubeList.add(new ModelBox(footrightfour, 14, 29, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftfour = new ModelRenderer(this);
		footleftfour.setRotationPoint(0.15F, 0.4F, 2.4F);
		body.addChild(footleftfour);
		footleftfour.cubeList.add(new ModelBox(footleftfour, 10, 29, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightthree = new ModelRenderer(this);
		footrightthree.setRotationPoint(-0.15F, 0.4F, 0.5F);
		body.addChild(footrightthree);
		footrightthree.cubeList.add(new ModelBox(footrightthree, 6, 29, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftthree = new ModelRenderer(this);
		footleftthree.setRotationPoint(0.15F, 0.4F, 0.5F);
		body.addChild(footleftthree);
		footleftthree.cubeList.add(new ModelBox(footleftthree, 27, 21, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrighttwo = new ModelRenderer(this);
		footrighttwo.setRotationPoint(-0.25F, 0.4F, -2.1F);
		body.addChild(footrighttwo);
		footrighttwo.cubeList.add(new ModelBox(footrighttwo, 27, 18, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightone = new ModelRenderer(this);
		footrightone.setRotationPoint(-0.25F, 0.4F, -3.9F);
		body.addChild(footrightone);
		footrightone.cubeList.add(new ModelBox(footrightone, 26, 6, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftone = new ModelRenderer(this);
		footleftone.setRotationPoint(0.25F, 0.4F, -3.9F);
		body.addChild(footleftone);
		footleftone.cubeList.add(new ModelBox(footleftone, 11, 11, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftback = new ModelRenderer(this);
		footleftback.setRotationPoint(0.15F, 0.2F, 5.4F);
		body.addChild(footleftback);
		setRotationAngle(footleftback, 0.2618F, 0.0F, 0.0F);
		footleftback.cubeList.add(new ModelBox(footleftback, 0, 10, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footlefttwo = new ModelRenderer(this);
		footlefttwo.setRotationPoint(0.25F, 0.4F, -2.1F);
		body.addChild(footlefttwo);
		footlefttwo.cubeList.add(new ModelBox(footlefttwo, 0, 0, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		butterfly = new ModelRenderer(this);
		butterfly.setRotationPoint(0.0F, -0.4F, -1.7F);
		body.addChild(butterfly);
		butterfly.cubeList.add(new ModelBox(butterfly, 9, 21, -1.0F, -1.0F, -2.8F, 2, 2, 3, 0.1F, false));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, -0.2F);
		butterfly.addChild(abdomen);
		setRotationAngle(abdomen, -0.1047F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -2.0F, -2.0F, -1.0F, 4, 4, 6, -0.6F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -0.2F, -3.2F);
		butterfly.addChild(head2);
		setRotationAngle(head2, 0.1047F, 0.0F, 0.0F);
		head2.cubeList.add(new ModelBox(head2, 25, 25, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F, false));

		antennae = new ModelRenderer(this);
		antennae.setRotationPoint(0.0F, -0.5651F, -0.5494F);
		head2.addChild(antennae);
		setRotationAngle(antennae, -0.4014F, 0.0F, 0.0F);
		antennae.cubeList.add(new ModelBox(antennae, 9, 0, -3.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		butterfly.addChild(wings);
		

		wingleft = new ModelRenderer(this);
		wingleft.setRotationPoint(0.8F, 0.0F, -1.3F);
		wings.addChild(wingleft);
		wingleft.cubeList.add(new ModelBox(wingleft, 0, 39, 0.0F, -0.5F, -18.7F, 20, 0, 39, 0.0F, false));

		wingright = new ModelRenderer(this);
		wingright.setRotationPoint(-0.8F, 0.0F, -1.3F);
		wings.addChild(wingright);
		wingright.cubeList.add(new ModelBox(wingright, 0, 0, -20.0F, -0.5F, -18.7F, 20, 0, 39, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
            this.wingright.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.wingleft.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.wingright.rotateAngleZ = MathHelper.cos(ageInTicks * 1.3F) * (float)Math.PI * 0.25F;
            this.wingleft.rotateAngleZ = -this.wingright.rotateAngleZ;
    }
}
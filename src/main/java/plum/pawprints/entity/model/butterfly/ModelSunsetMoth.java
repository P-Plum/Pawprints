package plum.pawprints.entity.model.butterfly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ModelSunsetMoth extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer butt;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer headplaneright;
	private final ModelRenderer headplaneleft;
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
	private final ModelRenderer rightplane;
	private final ModelRenderer leftplane;
	private final ModelRenderer backplaneone;
	private final ModelRenderer backplanetwo;
	private final ModelRenderer backplanethree;
	private final ModelRenderer backplanefour;
	private final ModelRenderer backplanefive;
	private final ModelRenderer buttplane;
	private final ModelRenderer moth;
	private final ModelRenderer abdomen;
	private final ModelRenderer head2;
	private final ModelRenderer antennae;
	private final ModelRenderer wings;
	private final ModelRenderer wingleft;
	private final ModelRenderer wingright;

	public ModelSunsetMoth() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.7F, 1.1F);
		body.cubeList.add(new ModelBox(body, 11, 29, -1.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F, false));

		butt = new ModelRenderer(this);
		butt.setRotationPoint(0.0F, 0.0F, 1.5F);
		body.addChild(butt);
		setRotationAngle(butt, 0.0349F, 0.0F, 0.0F);
		butt.cubeList.add(new ModelBox(butt, 0, 24, -1.5F, -1.5F, -0.5F, 3, 3, 5, -0.1F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 0.0173F, -1.9986F);
		body.addChild(neck);
		setRotationAngle(neck, -0.0873F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 15, 21, -1.5F, -1.5F, -5.1F, 3, 3, 5, 0.1F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.1071F, -4.6178F);
		neck.addChild(head);
		setRotationAngle(head, 0.384F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, -1.5F, -2.7F, 3, 3, 3, -0.3F, false));

		headplaneright = new ModelRenderer(this);
		headplaneright.setRotationPoint(-0.3F, 1.5222F, -0.1517F);
		head.addChild(headplaneright);
		setRotationAngle(headplaneright, -0.1571F, 0.0F, 0.0F);
		headplaneright.cubeList.add(new ModelBox(headplaneright, 0, 8, -1.0F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

		headplaneleft = new ModelRenderer(this);
		headplaneleft.setRotationPoint(0.2F, 1.5222F, -0.1517F);
		head.addChild(headplaneleft);
		setRotationAngle(headplaneleft, -0.1571F, 0.0F, 0.0F);
		headplaneleft.cubeList.add(new ModelBox(headplaneleft, 7, 3, 1.1F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

		footrightback = new ModelRenderer(this);
		footrightback.setRotationPoint(-0.15F, 0.2F, 5.4F);
		body.addChild(footrightback);
		setRotationAngle(footrightback, 0.2618F, 0.0F, 0.0F);
		footrightback.cubeList.add(new ModelBox(footrightback, 0, 26, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightfour = new ModelRenderer(this);
		footrightfour.setRotationPoint(-0.15F, 0.4F, 2.4F);
		body.addChild(footrightfour);
		footrightfour.cubeList.add(new ModelBox(footrightfour, 15, 23, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftfour = new ModelRenderer(this);
		footleftfour.setRotationPoint(0.15F, 0.4F, 2.4F);
		body.addChild(footleftfour);
		footleftfour.cubeList.add(new ModelBox(footleftfour, 11, 23, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightthree = new ModelRenderer(this);
		footrightthree.setRotationPoint(-0.15F, 0.4F, 0.5F);
		body.addChild(footrightthree);
		footrightthree.cubeList.add(new ModelBox(footrightthree, 0, 23, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftthree = new ModelRenderer(this);
		footleftthree.setRotationPoint(0.15F, 0.4F, 0.5F);
		body.addChild(footleftthree);
		footleftthree.cubeList.add(new ModelBox(footleftthree, 17, 16, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrighttwo = new ModelRenderer(this);
		footrighttwo.setRotationPoint(-0.25F, 0.4F, -2.1F);
		body.addChild(footrighttwo);
		footrighttwo.cubeList.add(new ModelBox(footrighttwo, 0, 16, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightone = new ModelRenderer(this);
		footrightone.setRotationPoint(-0.25F, 0.4F, -3.9F);
		body.addChild(footrightone);
		footrightone.cubeList.add(new ModelBox(footrightone, 14, 14, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftone = new ModelRenderer(this);
		footleftone.setRotationPoint(0.25F, 0.4F, -3.9F);
		body.addChild(footleftone);
		footleftone.cubeList.add(new ModelBox(footleftone, 0, 13, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftback = new ModelRenderer(this);
		footleftback.setRotationPoint(0.15F, 0.2F, 5.4F);
		body.addChild(footleftback);
		setRotationAngle(footleftback, 0.2618F, 0.0F, 0.0F);
		footleftback.cubeList.add(new ModelBox(footleftback, 9, 10, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footlefttwo = new ModelRenderer(this);
		footlefttwo.setRotationPoint(0.25F, 0.4F, -2.1F);
		body.addChild(footlefttwo);
		footlefttwo.cubeList.add(new ModelBox(footlefttwo, 9, 0, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		rightplane = new ModelRenderer(this);
		rightplane.setRotationPoint(0.0F, 0.6F, -1.1F);
		body.addChild(rightplane);
		setRotationAngle(rightplane, 0.0F, 0.0F, 0.2094F);
		rightplane.cubeList.add(new ModelBox(rightplane, 8, 8, -4.0F, -1.0F, -6.0F, 4, 0, 13, 0.0F, false));

		leftplane = new ModelRenderer(this);
		leftplane.setRotationPoint(0.0F, 0.6F, -1.1F);
		body.addChild(leftplane);
		setRotationAngle(leftplane, 0.0F, 0.0F, -0.2094F);
		leftplane.cubeList.add(new ModelBox(leftplane, 0, 0, 0.0F, -1.0F, -6.0F, 4, 0, 13, 0.0F, false));

		backplaneone = new ModelRenderer(this);
		backplaneone.setRotationPoint(0.0F, -1.0F, -5.2F);
		body.addChild(backplaneone);
		setRotationAngle(backplaneone, -0.6632F, 0.0F, 0.0F);
		backplaneone.cubeList.add(new ModelBox(backplaneone, 29, 14, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));

		backplanetwo = new ModelRenderer(this);
		backplanetwo.setRotationPoint(0.0F, -1.0F, -3.1F);
		body.addChild(backplanetwo);
		setRotationAngle(backplanetwo, -0.6632F, 0.0F, 0.0F);
		backplanetwo.cubeList.add(new ModelBox(backplanetwo, 29, 11, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));

		backplanethree = new ModelRenderer(this);
		backplanethree.setRotationPoint(0.0F, -1.0F, -0.9F);
		body.addChild(backplanethree);
		setRotationAngle(backplanethree, -0.6632F, 0.0F, 0.0F);
		backplanethree.cubeList.add(new ModelBox(backplanethree, 29, 8, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));

		backplanefour = new ModelRenderer(this);
		backplanefour.setRotationPoint(0.0F, -1.0F, 1.2F);
		body.addChild(backplanefour);
		setRotationAngle(backplanefour, -0.6632F, 0.0F, 0.0F);
		backplanefour.cubeList.add(new ModelBox(backplanefour, 22, 29, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));

		backplanefive = new ModelRenderer(this);
		backplanefive.setRotationPoint(0.0F, -1.0F, 3.2F);
		body.addChild(backplanefive);
		setRotationAngle(backplanefive, -0.6632F, 0.0F, 0.0F);
		backplanefive.cubeList.add(new ModelBox(backplanefive, 26, 21, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));

		buttplane = new ModelRenderer(this);
		buttplane.setRotationPoint(0.0F, -1.0F, 4.7F);
		body.addChild(buttplane);
		setRotationAngle(buttplane, -1.1519F, 0.0F, 0.0F);
		buttplane.cubeList.add(new ModelBox(buttplane, 21, 5, -2.5F, -3.0F, 0.0F, 5, 3, 0, 0.0F, false));

		moth = new ModelRenderer(this);
		moth.setRotationPoint(0.0F, -0.4F, -1.7F);
		body.addChild(moth);
		moth.cubeList.add(new ModelBox(moth, 0, 6, -1.0F, -1.0F, -2.8F, 2, 2, 3, 0.1F, false));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, -0.2F);
		moth.addChild(abdomen);
		setRotationAngle(abdomen, -0.1047F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 0, 13, -2.0F, -2.0F, -1.0F, 4, 4, 6, -0.6F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -0.2F, -3.2F);
		moth.addChild(head2);
		setRotationAngle(head2, 0.1047F, 0.0F, 0.0F);
		head2.cubeList.add(new ModelBox(head2, 29, 17, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F, false));

		antennae = new ModelRenderer(this);
		antennae.setRotationPoint(0.0F, -0.5651F, -0.5494F);
		head2.addChild(antennae);
		setRotationAngle(antennae, -0.4014F, 0.0F, 0.0F);
		antennae.cubeList.add(new ModelBox(antennae, 16, 0, -3.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		moth.addChild(wings);
		

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
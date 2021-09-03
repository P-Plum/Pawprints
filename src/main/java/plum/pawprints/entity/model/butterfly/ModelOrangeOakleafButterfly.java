package plum.pawprints.entity.model.butterfly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelOrangeOakleafButterfly extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer abdomen;
	private final ModelRenderer head;
	private final ModelRenderer antennae;
	private final ModelRenderer wings;
	private final ModelRenderer wingleft;
	private final ModelRenderer wingright;
	private final ModelRenderer caterpillar;
	private final ModelRenderer butt;
	private final ModelRenderer neck;
	private final ModelRenderer head2;
	private final ModelRenderer headplaneright;
	private final ModelRenderer headplaneleft;
	private final ModelRenderer horns;
	private final ModelRenderer horns_r1;
	private final ModelRenderer footrightback;
	private final ModelRenderer footleftback;
	private final ModelRenderer footrightfour;
	private final ModelRenderer footleftfour;
	private final ModelRenderer footrightthree;
	private final ModelRenderer footleftthree;
	private final ModelRenderer footrighttwo;
	private final ModelRenderer footlefttwo;
	private final ModelRenderer footrightone;
	private final ModelRenderer footleftone;
	private final ModelRenderer planes;
	private final ModelRenderer plane;
	private final ModelRenderer plane2;
	private final ModelRenderer plane3;
	private final ModelRenderer plane4;
	private final ModelRenderer plane5;
	private final ModelRenderer plane6;
	private final ModelRenderer plane7;
	private final ModelRenderer plane8;
	private final ModelRenderer plane9;
	private final ModelRenderer plane10;
	private final ModelRenderer bodyplane;

	public ModelOrangeOakleafButterfly() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.3F, -0.6F);
		body.cubeList.add(new ModelBox(body, 9, 40, -1.0F, -1.0F, -2.8F, 2, 2, 3, -0.2F, false));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, -0.2F);
		body.addChild(abdomen);
		setRotationAngle(abdomen, -0.1047F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 0, 13, -2.0F, -2.0F, -1.0F, 4, 4, 6, -0.9F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.2F, -3.2F);
		body.addChild(head);
		setRotationAngle(head, 0.1047F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 26, 13, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F, false));

		antennae = new ModelRenderer(this);
		antennae.setRotationPoint(0.0F, -0.5651F, -0.5494F);
		head.addChild(antennae);
		setRotationAngle(antennae, -0.4014F, 0.0F, 0.0F);
		antennae.cubeList.add(new ModelBox(antennae, 0, 0, -2.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(wings);
		

		wingleft = new ModelRenderer(this);
		wingleft.setRotationPoint(0.8F, 0.0F, -1.3F);
		wings.addChild(wingleft);
		wingleft.cubeList.add(new ModelBox(wingleft, 32, 0, 0.0F, -0.5F, -15.7F, 16, 0, 34, 0.0F, false));

		wingright = new ModelRenderer(this);
		wingright.setRotationPoint(-0.8F, 0.0F, -1.3F);
		wings.addChild(wingright);
		setRotationAngle(wingright, 0.0F, 0.0F, -0.0349F);
		wingright.cubeList.add(new ModelBox(wingright, 0, 0, -16.0F, -0.5F, -15.7F, 16, 0, 34, 0.0F, false));

		caterpillar = new ModelRenderer(this);
		caterpillar.setRotationPoint(0.0F, 0.4F, 1.7F);
		body.addChild(caterpillar);
		caterpillar.cubeList.add(new ModelBox(caterpillar, 11, 26, -1.5F, -1.5F, -2.5F, 3, 3, 5, -0.1F, false));

		butt = new ModelRenderer(this);
		butt.setRotationPoint(0.0F, 0.0F, 1.5F);
		caterpillar.addChild(butt);
		setRotationAngle(butt, 0.0349F, 0.0F, 0.0F);
		butt.cubeList.add(new ModelBox(butt, 0, 23, -1.5F, -1.5F, -0.5F, 3, 3, 5, -0.2F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 0.0173F, -1.9986F);
		caterpillar.addChild(neck);
		setRotationAngle(neck, -0.0349F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 15, 18, -1.5F, -1.5F, -5.1F, 3, 3, 5, 0.0F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -0.1071F, -4.6178F);
		neck.addChild(head2);
		setRotationAngle(head2, -0.1047F, 0.0F, 0.0F);
		head2.cubeList.add(new ModelBox(head2, 0, 5, -1.5F, -1.5F, -2.7F, 3, 3, 3, -0.3F, false));

		headplaneright = new ModelRenderer(this);
		headplaneright.setRotationPoint(-0.3F, 1.3134F, 1.3337F);
		head2.addChild(headplaneright);
		setRotationAngle(headplaneright, 0.0524F, 0.0F, 0.0F);
		headplaneright.cubeList.add(new ModelBox(headplaneright, 22, 25, -1.0F, -1.0F, -3.0F, 0, 2, 4, 0.0F, false));

		headplaneleft = new ModelRenderer(this);
		headplaneleft.setRotationPoint(0.3F, 1.3134F, 1.3337F);
		head2.addChild(headplaneleft);
		setRotationAngle(headplaneleft, 0.0524F, 0.0F, 0.0F);
		headplaneleft.cubeList.add(new ModelBox(headplaneleft, 0, 7, 1.0F, -1.0F, -3.0F, 0, 2, 4, 0.0F, false));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, -0.7702F, -2.4168F);
		head2.addChild(horns);
		setRotationAngle(horns, 0.6981F, 0.0F, 0.0F);
		

		horns_r1 = new ModelRenderer(this);
		horns_r1.setRotationPoint(0.0F, 0.1F, 0.0F);
		horns.addChild(horns_r1);
		setRotationAngle(horns_r1, 0.1047F, 0.0F, 0.0F);
		horns_r1.cubeList.add(new ModelBox(horns_r1, 14, 13, -3.0F, -4.0F, 0.0F, 6, 4, 0, 0.0F, false));

		footrightback = new ModelRenderer(this);
		footrightback.setRotationPoint(-0.15F, 0.4F, 5.3F);
		caterpillar.addChild(footrightback);
		setRotationAngle(footrightback, 0.1047F, 0.0F, 0.0F);
		footrightback.cubeList.add(new ModelBox(footrightback, 29, 3, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footleftback = new ModelRenderer(this);
		footleftback.setRotationPoint(0.15F, 0.4F, 5.3F);
		caterpillar.addChild(footleftback);
		setRotationAngle(footleftback, 0.1047F, 0.0F, 0.0F);
		footleftback.cubeList.add(new ModelBox(footleftback, 29, 0, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footrightfour = new ModelRenderer(this);
		footrightfour.setRotationPoint(-0.15F, 0.5F, 1.9F);
		caterpillar.addChild(footrightfour);
		setRotationAngle(footrightfour, 0.0524F, 0.0F, 0.0F);
		footrightfour.cubeList.add(new ModelBox(footrightfour, 26, 20, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footleftfour = new ModelRenderer(this);
		footleftfour.setRotationPoint(0.15F, 0.5F, 1.9F);
		caterpillar.addChild(footleftfour);
		setRotationAngle(footleftfour, 0.0524F, 0.0F, 0.0F);
		footleftfour.cubeList.add(new ModelBox(footleftfour, 26, 17, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footrightthree = new ModelRenderer(this);
		footrightthree.setRotationPoint(-0.15F, 0.5F, 0.3F);
		caterpillar.addChild(footrightthree);
		footrightthree.cubeList.add(new ModelBox(footrightthree, 11, 23, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footleftthree = new ModelRenderer(this);
		footleftthree.setRotationPoint(0.15F, 0.5F, 0.3F);
		caterpillar.addChild(footleftthree);
		footleftthree.cubeList.add(new ModelBox(footleftthree, 0, 23, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footrighttwo = new ModelRenderer(this);
		footrighttwo.setRotationPoint(-0.25F, 0.5F, -1.2F);
		caterpillar.addChild(footrighttwo);
		footrighttwo.cubeList.add(new ModelBox(footrighttwo, 0, 16, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footlefttwo = new ModelRenderer(this);
		footlefttwo.setRotationPoint(0.25F, 0.5F, -1.2F);
		caterpillar.addChild(footlefttwo);
		footlefttwo.cubeList.add(new ModelBox(footlefttwo, 0, 13, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footrightone = new ModelRenderer(this);
		footrightone.setRotationPoint(-0.25F, 0.5F, -2.8F);
		caterpillar.addChild(footrightone);
		setRotationAngle(footrightone, -0.0698F, 0.0F, 0.0F);
		footrightone.cubeList.add(new ModelBox(footrightone, 9, 5, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		footleftone = new ModelRenderer(this);
		footleftone.setRotationPoint(0.25F, 0.5F, -2.8F);
		caterpillar.addChild(footleftone);
		setRotationAngle(footleftone, -0.0698F, 0.0F, 0.0F);
		footleftone.cubeList.add(new ModelBox(footleftone, 0, 0, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.1F, false));

		planes = new ModelRenderer(this);
		planes.setRotationPoint(0.0F, 0.0F, 0.0F);
		caterpillar.addChild(planes);
		

		plane = new ModelRenderer(this);
		plane.setRotationPoint(0.0F, -1.5998F, -6.4639F);
		planes.addChild(plane);
		setRotationAngle(plane, -0.1222F, 0.0F, 0.0F);
		plane.cubeList.add(new ModelBox(plane, 0, 40, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane2 = new ModelRenderer(this);
		plane2.setRotationPoint(0.0F, -1.4998F, -4.8639F);
		planes.addChild(plane2);
		setRotationAngle(plane2, -0.1222F, 0.0F, 0.0F);
		plane2.cubeList.add(new ModelBox(plane2, 36, 37, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane3 = new ModelRenderer(this);
		plane3.setRotationPoint(0.0F, -1.3998F, -3.0639F);
		planes.addChild(plane3);
		setRotationAngle(plane3, -0.1222F, 0.0F, 0.0F);
		plane3.cubeList.add(new ModelBox(plane3, 24, 37, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane4 = new ModelRenderer(this);
		plane4.setRotationPoint(0.0F, -1.1998F, -1.3639F);
		planes.addChild(plane4);
		setRotationAngle(plane4, -0.1222F, 0.0F, 0.0F);
		plane4.cubeList.add(new ModelBox(plane4, 12, 37, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane5 = new ModelRenderer(this);
		plane5.setRotationPoint(0.0F, -1.1998F, 0.1361F);
		planes.addChild(plane5);
		setRotationAngle(plane5, -0.1222F, 0.0F, 0.0F);
		plane5.cubeList.add(new ModelBox(plane5, 0, 37, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane6 = new ModelRenderer(this);
		plane6.setRotationPoint(0.0F, -1.2998F, 1.6361F);
		planes.addChild(plane6);
		setRotationAngle(plane6, -0.1222F, 0.0F, 0.0F);
		plane6.cubeList.add(new ModelBox(plane6, 36, 34, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane7 = new ModelRenderer(this);
		plane7.setRotationPoint(0.0F, -1.2998F, 3.2361F);
		planes.addChild(plane7);
		setRotationAngle(plane7, -0.1222F, 0.0F, 0.0F);
		plane7.cubeList.add(new ModelBox(plane7, 24, 34, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane8 = new ModelRenderer(this);
		plane8.setRotationPoint(0.0F, -1.0998F, 4.5361F);
		planes.addChild(plane8);
		setRotationAngle(plane8, -0.1745F, 0.0F, 0.0F);
		plane8.cubeList.add(new ModelBox(plane8, 12, 34, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane9 = new ModelRenderer(this);
		plane9.setRotationPoint(0.0F, -0.7998F, 5.4361F);
		planes.addChild(plane9);
		setRotationAngle(plane9, -0.4014F, 0.0F, 0.0F);
		plane9.cubeList.add(new ModelBox(plane9, 0, 34, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		plane10 = new ModelRenderer(this);
		plane10.setRotationPoint(0.0F, -0.2998F, 5.6361F);
		planes.addChild(plane10);
		setRotationAngle(plane10, -0.6807F, 0.0F, 0.0F);
		plane10.cubeList.add(new ModelBox(plane10, 22, 26, -3.0F, -2.9F, 0.0F, 6, 3, 0, 0.0F, false));

		bodyplane = new ModelRenderer(this);
		bodyplane.setRotationPoint(0.0F, -0.3F, -0.1F);
		caterpillar.addChild(bodyplane);
		setRotationAngle(bodyplane, -0.0175F, 0.0F, 0.0F);
		bodyplane.cubeList.add(new ModelBox(bodyplane, 0, 0, -4.0F, 0.0F, -7.0F, 8, 0, 13, 0.0F, false));
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
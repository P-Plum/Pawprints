// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko

package plum.pawprints.entity.model.butterfly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;


public class ModelLunaMoth extends ModelBase {
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
	private final ModelRenderer butterfly;
	private final ModelRenderer abdomen;
	private final ModelRenderer butterflyhead;
	private final ModelRenderer antennae;
	private final ModelRenderer wings;
	private final ModelRenderer wingleft;
	private final ModelRenderer wingright;

	public ModelLunaMoth() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.7F, 1.1F);
		body.cubeList.add(new ModelBox(body, 0, 31, -1.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F, false));

		butt = new ModelRenderer(this);
		butt.setRotationPoint(0.0F, 0.0F, 1.5F);
		body.addChild(butt);
		setRotationAngle(butt, 0.0349F, 0.0F, 0.0F);
		butt.cubeList.add(new ModelBox(butt, 0, 23, -1.5F, -1.5F, -0.5F, 3, 3, 5, -0.1F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 0.0173F, -1.9986F);
		body.addChild(neck);
		setRotationAngle(neck, -0.0873F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 15, -1.5F, -1.5F, -5.1F, 3, 3, 5, 0.1F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.1071F, -4.6178F);
		neck.addChild(head);
		setRotationAngle(head, 0.384F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 39, -1.5F, -1.5F, -2.7F, 3, 3, 3, -0.3F, false));

		headplaneright = new ModelRenderer(this);
		headplaneright.setRotationPoint(-0.3F, 1.5222F, -0.1517F);
		head.addChild(headplaneright);
		setRotationAngle(headplaneright, -0.1571F, 0.0F, 0.0F);
		headplaneright.cubeList.add(new ModelBox(headplaneright, 14, 0, -1.0F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

		headplaneleft = new ModelRenderer(this);
		headplaneleft.setRotationPoint(0.2F, 1.5222F, -0.1517F);
		head.addChild(headplaneleft);
		setRotationAngle(headplaneleft, -0.1571F, 0.0F, 0.0F);
		headplaneleft.cubeList.add(new ModelBox(headplaneleft, 0, 0, 1.1F, -1.0F, -2.0F, 0, 2, 3, 0.0F, false));

		footrightback = new ModelRenderer(this);
		footrightback.setRotationPoint(-0.15F, 0.2F, 5.4F);
		body.addChild(footrightback);
		setRotationAngle(footrightback, 0.2618F, 0.0F, 0.0F);
		footrightback.cubeList.add(new ModelBox(footrightback, 14, 25, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightfour = new ModelRenderer(this);
		footrightfour.setRotationPoint(-0.15F, 0.4F, 2.4F);
		body.addChild(footrightfour);
		footrightfour.cubeList.add(new ModelBox(footrightfour, 11, 23, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftfour = new ModelRenderer(this);
		footleftfour.setRotationPoint(0.15F, 0.4F, 2.4F);
		body.addChild(footleftfour);
		footleftfour.cubeList.add(new ModelBox(footleftfour, 0, 23, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightthree = new ModelRenderer(this);
		footrightthree.setRotationPoint(-0.15F, 0.4F, 0.5F);
		body.addChild(footrightthree);
		footrightthree.cubeList.add(new ModelBox(footrightthree, 15, 22, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftthree = new ModelRenderer(this);
		footleftthree.setRotationPoint(0.15F, 0.4F, 0.5F);
		body.addChild(footleftthree);
		footleftthree.cubeList.add(new ModelBox(footleftthree, 16, 19, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrighttwo = new ModelRenderer(this);
		footrighttwo.setRotationPoint(-0.25F, 0.4F, -2.1F);
		body.addChild(footrighttwo);
		footrighttwo.cubeList.add(new ModelBox(footrighttwo, 0, 16, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footrightone = new ModelRenderer(this);
		footrightone.setRotationPoint(-0.25F, 0.4F, -3.9F);
		body.addChild(footrightone);
		footrightone.cubeList.add(new ModelBox(footrightone, 14, 0, -1.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

		footleftone = new ModelRenderer(this);
		footleftone.setRotationPoint(0.25F, 0.4F, -3.9F);
		body.addChild(footleftone);
		footleftone.cubeList.add(new ModelBox(footleftone, 0, 13, 0.2F, -0.3F, -0.5F, 1, 2, 1, 0.2F, false));

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
		butterfly.setRotationPoint(0.0F, 21.3F, -0.6F);
		butterfly.cubeList.add(new ModelBox(butterfly, 13, 37, -1.0F, -1.0F, -2.8F, 2, 2, 3, 0.1F, false));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, -0.2F);
		butterfly.addChild(abdomen);
		setRotationAngle(abdomen, -0.1047F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -2.0F, -2.0F, -1.0F, 4, 4, 6, -0.6F, false));

		butterflyhead = new ModelRenderer(this);
		butterflyhead.setRotationPoint(0.0F, -0.2F, -3.2F);
		butterfly.addChild(butterflyhead);
		setRotationAngle(butterflyhead, 0.1047F, 0.0F, 0.0F);
		butterflyhead.cubeList.add(new ModelBox(butterflyhead, 11, 15, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F, false));

		antennae = new ModelRenderer(this);
		antennae.setRotationPoint(0.0F, -0.5651F, -0.5494F);
		butterflyhead.addChild(antennae);
		setRotationAngle(antennae, -0.4014F, 0.0F, 0.0F);
		antennae.cubeList.add(new ModelBox(antennae, 0, 10, -3.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		butterfly.addChild(wings);
		

		wingleft = new ModelRenderer(this);
		wingleft.setRotationPoint(0.8F, 0.0F, -1.3F);
		wings.addChild(wingleft);
		wingleft.cubeList.add(new ModelBox(wingleft, 0, 20, 0.0F, -0.5F, -6.7F, 11, 0, 20, 0.0F, false));

		wingright = new ModelRenderer(this);
		wingright.setRotationPoint(-0.8F, 0.0F, -1.3F);
		wings.addChild(wingright);
		wingright.cubeList.add(new ModelBox(wingright, 0, 0, -11.0F, -0.5F, -6.7F, 11, 0, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		butterfly.render(f5);
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
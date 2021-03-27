package plum.pawprints.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelBilbyScarf extends ModelBiped {
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public ModelBilbyScarf() {
		textureWidth = 128;
		textureHeight = 128;

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.1F, 0.3F, -5.1F);
		setRotationAngle(bone2, 0.0F, 0.1571F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 88, 88, -5.0F, -1.0F, 0.0F, 5, 3, 3, 0.2F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.3F, 0.0F, 0.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.3142F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 88, 88, -0.0831F, -1.0F, 0.1144F, 5, 3, 3, 0.2F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.1F, 0.3F, 5.1F);
		setRotationAngle(bone4, 0.0F, -0.1571F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 88, 94, -5.0F, -1.0F, -3.0F, 5, 3, 3, 0.2F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.3F, 0.0F, 0.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.3142F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 88, 94, -0.0831F, -1.0F, -3.1144F, 5, 3, 3, 0.2F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.3F, 24.2F, 2.1F);
		setRotationAngle(bone, 0.0F, 0.3316F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 110, 97, 3.6F, -24.9F, -4.0F, 3, 3, 4, 0.1F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.3F, 24.2F, -2.1F);
		setRotationAngle(bone6, 0.0F, -0.3316F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 88, 106, 3.6F, -24.9F, 0.0F, 3, 3, 4, 0.1F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.3F, 24.2F, 2.1F);
		setRotationAngle(bone7, 0.0F, -0.3316F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 100, 102, -6.6F, -24.9F, -4.0F, 3, 3, 4, 0.1F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.3F, 24.2F, -2.1F);
		setRotationAngle(bone8, 0.0F, 0.3316F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 100, 102, -6.6F, -24.9F, 0.0F, 3, 3, 4, 0.1F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.9F, 3.3F, -1.7F);
		setRotationAngle(bone9, -0.1745F, -0.384F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 88, 113, -1.0F, -1.0F, -2.0F, 2, 6, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-2.9F, 1.2F, -1.7F);
		setRotationAngle(bone10, -0.1745F, 0.384F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 112, 112, -1.0F, -1.0F, -2.0F, 2, 6, 2, 0.0F, false));
		
		this.bipedHead.addChild(bone);
		this.bipedHead.addChild(bone2);
		this.bipedHead.addChild(bone3);
		this.bipedHead.addChild(bone4);
		this.bipedHead.addChild(bone5);
		this.bipedHead.addChild(bone6);
		this.bipedHead.addChild(bone7);
		this.bipedHead.addChild(bone8);
		this.bipedHead.addChild(bone9);
		this.bipedHead.addChild(bone10);
	}

	public void render(net.minecraft.entity.Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
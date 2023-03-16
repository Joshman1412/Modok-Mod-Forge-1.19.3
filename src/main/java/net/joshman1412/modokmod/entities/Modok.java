package net.joshman1412.modokmod.entities;

import net.joshman1412.modokmod.init.EntityInit;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.UUID;



public class Modok extends TamableAnimal {
    public Modok(EntityType<? extends TamableAnimal> type, Level level) {
        super(type, level);
    }
    private static final EntityDataAccessor<Byte> DATA_ID_FLAGS = SynchedEntityData.defineId(AbstractHorse.class, EntityDataSerializers.BYTE);
    private static final EntityDataAccessor<Optional<UUID>> DATA_ID_OWNER_UUID = SynchedEntityData.defineId(AbstractHorse.class, EntityDataSerializers.OPTIONAL_UUID);
    private static final int FLAG_TAME = 2;
    private static final int FLAG_SADDLE = 4;
    public static final int INV_SLOT_SADDLE = 0;
    protected boolean getFlag(int p_30648_) {
        return (this.entityData.get(DATA_ID_FLAGS) & p_30648_) != 0;
    }
    protected void setFlag(int p_30598_, boolean p_30599_) {
        byte b0 = this.entityData.get(DATA_ID_FLAGS);
        if (p_30599_) {
            this.entityData.set(DATA_ID_FLAGS, (byte)(b0 | p_30598_));
        } else {
            this.entityData.set(DATA_ID_FLAGS, (byte)(b0 & ~p_30598_));
        }

    }
    public boolean isTamed() {
        return this.getFlag(2);
    }

    public InteractionResult mobInteract(Player p_30713_, InteractionHand p_30714_) {
        boolean flag = this.isTamed() && p_30713_.isSecondaryUseActive();
        if (!this.isVehicle() && !flag) {
            ItemStack itemstack = p_30713_.getItemInHand(p_30714_);
            if (!itemstack.isEmpty()) {
                if (this.isFood(itemstack)) {

                }
            }
            return super.mobInteract(p_30713_, p_30714_);
        } else {
            return super.mobInteract(p_30713_, p_30714_);
        }
    }
                @Override
                protected void registerGoals ()
                {
                    this.goalSelector.addGoal(0, new FloatGoal(this));
                    this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
                    this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
                    this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1D));
                    this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
                    this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
                    this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
                }

                public static AttributeSupplier.Builder getModokAttributes ()
                {
                    return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 25.0D).add(Attributes.FLYING_SPEED, 0.6D).add(Attributes.MOVEMENT_SPEED, 0.6D);
                }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }
}
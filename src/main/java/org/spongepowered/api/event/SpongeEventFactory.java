package org.spongepowered.api.event;

import org.spongepowered.api.event.cause.*;
import org.spongepowered.api.effect.sound.record.*;
import org.spongepowered.api.effect.sound.*;
import org.spongepowered.api.event.sound.*;
import org.spongepowered.api.entity.living.player.gamemode.*;
import org.spongepowered.api.data.manipulator.immutable.entity.*;
import org.spongepowered.api.data.manipulator.mutable.entity.*;
import org.spongepowered.api.statistic.*;
import org.spongepowered.api.event.statistic.*;
import org.spongepowered.api.util.ban.*;
import org.spongepowered.api.entity.living.player.*;
import org.spongepowered.api.item.inventory.*;
import org.spongepowered.api.entity.projectile.*;
import org.spongepowered.api.text.channel.*;
import org.spongepowered.api.item.*;
import org.spongepowered.api.service.*;
import org.spongepowered.api.event.service.*;
import com.flowpowered.math.vector.*;
import org.spongepowered.api.event.server.*;
import org.spongepowered.api.world.weather.*;
import com.google.common.reflect.*;
import org.spongepowered.api.registry.*;
import org.spongepowered.api.event.game.*;
import org.spongepowered.api.service.economy.transaction.*;
import org.spongepowered.api.event.economy.*;
import org.spongepowered.api.entity.ai.*;
import org.spongepowered.api.entity.ai.task.*;
import org.spongepowered.api.event.entity.ai.*;
import org.spongepowered.api.block.tileentity.carrier.*;
import org.spongepowered.api.world.explosion.*;
import org.spongepowered.api.data.type.*;
import org.spongepowered.api.util.*;
import org.spongepowered.api.entity.*;
import org.spongepowered.api.block.*;
import org.spongepowered.api.world.*;
import org.spongepowered.api.world.storage.*;
import java.net.*;
import org.spongepowered.api.event.server.query.*;
import org.spongepowered.api.command.*;
import org.spongepowered.api.event.entity.living.*;
import org.spongepowered.api.event.cause.entity.dismount.*;
import org.spongepowered.api.entity.living.*;
import org.spongepowered.api.command.source.*;
import org.spongepowered.api.event.network.rcon.*;
import org.spongepowered.api.advancement.*;
import org.spongepowered.api.event.advancement.*;
import org.spongepowered.api.advancement.criteria.*;
import org.spongepowered.api.data.*;
import org.spongepowered.api.event.data.*;
import org.spongepowered.api.event.message.*;
import org.spongepowered.api.*;
import java.time.*;
import org.spongepowered.api.event.command.*;
import org.spongepowered.api.world.gen.*;
import org.spongepowered.api.entity.explosive.*;
import org.spongepowered.api.effect.potion.*;
import org.spongepowered.api.entity.living.animal.*;
import org.spongepowered.api.event.world.chunk.*;
import org.spongepowered.api.resourcepack.*;
import org.spongepowered.api.network.*;
import org.spongepowered.api.profile.*;
import org.spongepowered.api.event.network.*;
import org.spongepowered.api.network.status.*;
import org.spongepowered.api.event.user.*;
import org.spongepowered.api.event.block.*;
import org.spongepowered.api.text.*;
import org.spongepowered.api.event.entity.item.*;
import org.spongepowered.api.item.recipe.*;
import org.spongepowered.api.event.entity.living.humanoid.*;
import org.spongepowered.api.data.manipulator.immutable.tileentity.*;
import org.spongepowered.api.data.manipulator.mutable.tileentity.*;
import org.spongepowered.api.block.tileentity.*;
import org.spongepowered.api.event.block.tileentity.*;
import org.spongepowered.api.event.entity.explosive.*;
import org.spongepowered.api.advancement.criteria.trigger.*;
import org.spongepowered.api.event.entity.*;
import org.spongepowered.api.event.world.*;
import org.spongepowered.api.event.entity.projectile.*;
import org.spongepowered.api.event.game.state.*;
import org.spongepowered.api.item.inventory.crafting.*;
import org.spongepowered.api.item.inventory.transaction.*;
import org.spongepowered.api.event.action.*;
import org.spongepowered.api.text.chat.*;
import java.util.*;
import org.spongepowered.api.event.entity.living.humanoid.player.*;
import org.spongepowered.api.event.item.inventory.*;

// TODO: Implement
public final class SpongeEventFactory
{
    public static FishingEvent.Stop createFishingEventStop(final Cause cause, final FishHook fishHook, final List transactions) {
        return null;
    }

    public static UseItemStackEvent.Stop createUseItemStackEventStop(final Cause cause, final int originalRemainingDuration, final int remainingDuration, final ItemStackSnapshot itemStackInUse) {
        return null;
    }

    public static PlaySoundEvent.Record.Stop createPlaySoundEventRecordStop(final Cause cause, final Jukebox jukebox, final Location location, final RecordType recordType, final SoundCategory soundCategory, final SoundType soundType, final float pitch, final float volume) {
        return null;
    }

    public static RotateEntityEvent createRotateEntityEvent(final Cause cause, final Transform fromTransform, final Transform toTransform, final Entity targetEntity) {
        return null;
    }

    public static EnchantItemEvent.CalculateLevelRequirement createEnchantItemEventCalculateLevelRequirement(final Cause cause, final int originalLevelRequirement, final int levelRequirement, final ItemStackSnapshot item, final Container targetInventory, final int option, final int power, final int seed) {
        return null;
    }

    public static ChangeGameModeEvent.TargetPlayer createChangeGameModeEventTargetPlayer(final Cause cause, final GameMode originalGameMode, final GameMode gameMode, final Player targetEntity) {
        return null;
    }

    public static ChangeLevelEvent.TargetPlayer createChangeLevelEventTargetPlayer(final Cause cause, final int originalLevel, final int level, final Player targetEntity) {
        return null;
    }

    public static ChangeEntityEquipmentEvent.TargetPlayer createChangeEntityEquipmentEventTargetPlayer(final Cause cause, final Player targetEntity, final Slot targetInventory, final Transaction transaction) {
        return null;
    }

    public static HarvestEntityEvent.TargetPlayer createHarvestEntityEventTargetPlayer(final Cause cause, final ImmutableExperienceHolderData originalData, final ExperienceHolderData finalData, final Player targetEntity, final boolean keepsInventory, final boolean keepsLevel, final int level) {
        return null;
    }

    public static ChangeStatisticEvent.TargetPlayer createChangeStatisticEventTargetPlayer(final Cause cause, final long originalValue, final long value, final Statistic statistic, final Player targetEntity) {
        return null;
    }

    public static BanUserEvent.TargetPlayer createBanUserEventTargetPlayer(final Cause cause, final Ban.Profile ban, final Player targetEntity, final User targetUser) {
        return null;
    }

    public static PardonUserEvent.TargetPlayer createPardonUserEventTargetPlayer(final Cause cause, final Ban.Profile ban, final Player targetEntity, final Player targetUser) {
        return null;
    }

    public static ChangeWorldBorderEvent.TargetPlayer createChangeWorldBorderEventTargetPlayer(final Cause cause, final Optional newBorder, final Optional previousBorder, final Player targetEntity) {
        return null;
    }

    public static ChangeBlockEvent.Grow createChangeBlockEventGrow(final Cause cause, final List transactions) {
        return null;
    }

    public static TargetChunkEvent createTargetChunkEvent(final Cause cause, final Chunk targetChunk) {
        return null;
    }

    public static TameEntityEvent createTameEntityEvent(final Cause cause, final Entity targetEntity) {
        return null;
    }

    public static ChangeInventoryEvent.SwapHand createChangeInventoryEventSwapHand(final Cause cause, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static SpawnEntityEvent.Spawner createSpawnEntityEventSpawner(final Cause cause, final List entities) {
        return null;
    }

    public static TargetTileEntityEvent createTargetTileEntityEvent(final Cause cause, final TileEntity targetTile) {
        return null;
    }

    public static TargetProjectileEvent createTargetProjectileEvent(final Cause cause, final Projectile targetEntity) {
        return null;
    }

    public static BanUserEvent createBanUserEvent(final Cause cause, final Ban.Profile ban, final User targetUser) {
        return null;
    }

    public static GameStoppedServerEvent createGameStoppedServerEvent(final Cause cause) {
        return null;
    }

    public static FishingEvent.HookEntity createFishingEventHookEntity(final Cause cause, final FishHook fishHook, final Entity targetEntity) {
        return null;
    }

    public static AffectItemStackEvent createAffectItemStackEvent(final Cause cause, final List transactions) {
        return null;
    }

    public static DestructEntityEvent createDestructEntityEvent(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final Entity targetEntity, final boolean messageCancelled) {
        return null;
    }

    public static DropItemEvent.Close createDropItemEventClose(final Cause cause, final List entities) {
        return null;
    }

    public static InteractInventoryEvent.Close createInteractInventoryEventClose(final Cause cause, final Transaction cursorTransaction, final Container targetInventory) {
        return null;
    }

    public static TargetAgentEvent createTargetAgentEvent(final Cause cause, final Agent targetEntity) {
        return null;
    }

    public static GameInitializationEvent createGameInitializationEvent(final Cause cause) {
        return null;
    }

    public static CooldownEvent.Set createCooldownEventSet(final Cause cause, final int originalNewCooldown, final int newCooldown, final ItemType itemType, final OptionalInt startingCooldown, final Player targetEntity) {
        return null;
    }

    public static SetAITargetEvent createSetAITargetEvent(final Cause cause, final Optional target, final Agent targetEntity) {
        return null;
    }

    public static GameStartingServerEvent createGameStartingServerEvent(final Cause cause) {
        return null;
    }

    public static InteractInventoryEvent.Open createInteractInventoryEventOpen(final Cause cause, final Transaction cursorTransaction, final Container targetInventory) {
        return null;
    }

    public static GameStartedServerEvent createGameStartedServerEvent(final Cause cause) {
        return null;
    }

    public static ChangeServiceProviderEvent createChangeServiceProviderEvent(final Cause cause, final ProviderRegistration newProviderRegistration, final Optional previousProviderRegistration) {
        return null;
    }

    public static ForcedChunkEvent createForcedChunkEvent(final Cause cause, final Vector3i chunkCoords, final ChunkTicketManager.LoadingTicket ticket) {
        return null;
    }

    public static PlaySoundEvent.Broadcast createPlaySoundEventBroadcast(final Cause cause, final Location location, final SoundCategory soundCategory, final SoundType soundType, final float pitch, final float volume) {
        return null;
    }

    public static MoveEntityEvent.Teleport.Portal createMoveEntityEventTeleportPortal(final Cause cause, final Transform fromTransform, final Transform toTransform, final PortalAgent portalAgent, final Entity targetEntity, final boolean keepsVelocity, final boolean usePortalAgent) {
        return null;
    }

    public static TargetWorldEvent createTargetWorldEvent(final Cause cause, final World targetWorld) {
        return null;
    }

    public static ClientPingServerEvent.Response.Players createClientPingServerEventResponsePlayers(final List profiles, final int max, final int online) {
        return null;
    }

    public static TargetInventoryEvent createTargetInventoryEvent(final Cause cause, final Inventory targetInventory) {
        return null;
    }

    public static DamageEntityEvent createDamageEntityEvent(final Cause cause, final List originalFunctions, final Entity targetEntity, final double originalDamage) {
        return null;
    }

    public static PlaySoundEvent.NoteBlock createPlaySoundEventNoteBlock(final Cause cause, final InstrumentType instrument, final Location location, final Note note, final NotePitch notePitch, final SoundCategory soundCategory, final SoundType soundType, final float pitch, final float volume) {
        return null;
    }

    public static ChangeWorldWeatherEvent createChangeWorldWeatherEvent(final Cause cause, final int originalDuration, final int duration, final Weather originalWeather, final Weather weather, final Weather initialWeather, final World targetWorld) {
        return null;
    }

    public static UnleashEntityEvent createUnleashEntityEvent(final Cause cause, final Entity targetEntity) {
        return null;
    }

    public static ChangeBlockEvent.Place createChangeBlockEventPlace(final Cause cause, final List transactions) {
        return null;
    }

    public static GameRegistryEvent.Register createGameRegistryEventRegister(final Cause cause, final Class catalogType, final TypeToken genericType, final CatalogRegistryModule registryModule) {
        return null;
    }

    public static ChannelRegistrationEvent.Register createChannelRegistrationEventRegister(final Cause cause, final String channel) {
        return null;
    }

    public static ChangeEntityExperienceEvent createChangeEntityExperienceEvent(final Cause cause, final ImmutableExperienceHolderData originalData, final ExperienceHolderData finalData, final Entity targetEntity) {
        return null;
    }

    public static GameReloadEvent createGameReloadEvent(final Cause cause) {
        return null;
    }

    public static ChangeBlockEvent.Decay createChangeBlockEventDecay(final Cause cause, final List transactions) {
        return null;
    }

    public static ChangeInventoryEvent createChangeInventoryEvent(final Cause cause, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static EconomyTransactionEvent createEconomyTransactionEvent(final Cause cause, final TransactionResult transactionResult) {
        return null;
    }

    public static HealEntityEvent createHealEntityEvent(final Cause cause, final List originalFunctions, final Entity targetEntity, final double originalHealAmount) {
        return null;
    }

    public static BreedEntityEvent.Breed createBreedEntityEventBreed(final Cause cause, final Optional interactionPoint, final Ageable offspringEntity, final Entity targetEntity) {
        return null;
    }

    public static TargetEntityEvent createTargetEntityEvent(final Cause cause, final Entity targetEntity) {
        return null;
    }

    public static AITaskEvent.Add createAITaskEventAdd(final Cause cause, final int originalPriority, final int priority, final Goal goal, final Agent targetEntity, final AITask task) {
        return null;
    }

    public static FishingEvent.Start createFishingEventStart(final Cause cause, final FishHook fishHook) {
        return null;
    }

    public static BrewingEvent.Start createBrewingEventStart(final Cause cause, final ItemStackSnapshot ingredient, final BrewingStand targetTile, final List transactions) {
        return null;
    }

    public static SmeltEvent.Start createSmeltEventStart(final Cause cause, final ItemStackSnapshot fuel, final Furnace targetTile, final List transactions) {
        return null;
    }

    public static UseItemStackEvent.Start createUseItemStackEventStart(final Cause cause, final int originalRemainingDuration, final int remainingDuration, final ItemStackSnapshot itemStackInUse) {
        return null;
    }

    public static PlaySoundEvent.Record.Start createPlaySoundEventRecordStart(final Cause cause, final Jukebox jukebox, final Location location, final RecordType recordType, final SoundCategory soundCategory, final SoundType soundType, final float pitch, final float volume) {
        return null;
    }

    public static SleepingEvent.Pre createSleepingEventPre(final Cause cause, final BlockSnapshot bed, final Entity targetEntity) {
        return null;
    }

    public static LightningEvent.Pre createLightningEventPre(final Cause cause) {
        return null;
    }

    public static ChangeInventoryEvent.Transfer.Pre createChangeInventoryEventTransferPre(final Cause cause, final Inventory sourceInventory, final Inventory targetInventory) {
        return null;
    }

    public static ChangeBlockEvent.Pre createChangeBlockEventPre(final Cause cause, final List locations) {
        return null;
    }

    public static ChunkPreGenerationEvent.Pre createChunkPreGenerationEventPre(final Cause cause, final ChunkPreGenerate chunkPreGenerate, final World targetWorld, final boolean skipStep) {
        return null;
    }

    public static ExplosionEvent.Pre createExplosionEventPre(final Cause cause, final Explosion explosion, final World targetWorld) {
        return null;
    }

    public static InteractBlockEvent.Primary.OffHand createInteractBlockEventPrimaryOffHand(final Cause cause, final HandType handType, final Optional interactionPoint, final BlockSnapshot targetBlock, final Direction targetSide) {
        return null;
    }

    public static InteractEntityEvent.Secondary.OffHand createInteractEntityEventSecondaryOffHand(final Cause cause, final HandType handType, final Optional interactionPoint, final Entity targetEntity) {
        return null;
    }

    public static InteractItemEvent.Primary.OffHand createInteractItemEventPrimaryOffHand(final Cause cause, final HandType handType, final Optional interactionPoint, final ItemStackSnapshot itemStack) {
        return null;
    }

    public static InteractItemEvent.Secondary.OffHand createInteractItemEventSecondaryOffHand(final Cause cause, final HandType handType, final Optional interactionPoint, final ItemStackSnapshot itemStack) {
        return null;
    }

    public static InteractBlockEvent.Secondary.OffHand createInteractBlockEventSecondaryOffHand(final Cause cause, final Tristate originalUseBlockResult, final Tristate useBlockResult, final Tristate originalUseItemResult, final Tristate useItemResult, final HandType handType, final Optional interactionPoint, final BlockSnapshot targetBlock, final Direction targetSide) {
        return null;
    }

    public static DefuseExplosiveEvent.Pre createDefuseExplosiveEventPre(final Cause cause, final FusedExplosive targetEntity) {
        return null;
    }

    public static DropItemEvent.Pre createDropItemEventPre(final Cause cause, final List originalDroppedItems, final List droppedItems) {
        return null;
    }

    public static ChangeInventoryEvent.Pickup.Pre createChangeInventoryEventPickupPre(final Cause cause, final Optional custom, final List finalList, final ItemStackSnapshot originalStack, final Item targetEntity, final Inventory targetInventory) {    return null;
    }

    public static GenerateChunkEvent.Pre createGenerateChunkEventPre(final Cause cause, final Chunk targetChunk) {
        return null;
    }

    public static PopulateChunkEvent.Pre createPopulateChunkEventPre(final Cause cause, final List pendingPopulators, final Chunk targetChunk) {
        return null;
    }

    public static PrimeExplosiveEvent.Pre createPrimeExplosiveEventPre(final Cause cause, final FusedExplosive targetEntity) {
        return null;
    }

    public static ConstructEntityEvent.Pre createConstructEntityEventPre(final Cause cause, final EntityType targetType, final Transform transform) {
        return null;
    }

    public static SaveWorldEvent.Pre createSaveWorldEventPre(final Cause cause, final World targetWorld) {
        return null;
    }

    public static InteractEntityEvent.Primary.OffHand createInteractEntityEventPrimaryOffHand(final Cause cause, final HandType handType, final Optional interactionPoint, final Entity targetEntity) {
        return null;
    }

    public static AffectSlotEvent createAffectSlotEvent(final Cause cause, final List transactions) {
        return null;
    }

    public static CollideBlockEvent createCollideBlockEvent(final Cause cause, final BlockState targetBlock, final Location targetLocation, final Direction targetSide) {
        return null;
    }

    public static ConstructWorldPropertiesEvent createConstructWorldPropertiesEvent(final Cause cause, final WorldArchetype worldArchetype, final WorldProperties worldProperties) {
        return null;
    }

    public static SpawnEntityEvent.ChunkLoad createSpawnEntityEventChunkLoad(final Cause cause, final List entities) {
        return null;
    }

    public static ClickInventoryEvent.Drop.Full createClickInventoryEventDropFull(final Cause cause, final Transaction cursorTransaction, final List entities, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static QueryServerEvent.Full createQueryServerEventFull(final Cause cause, final InetSocketAddress address, final Map customValuesMap, final String gameId, final String gameType, final String map, final String motd, final List players, final String plugins, final String version, final int maxPlayerCount, final int maxSize, final int playerCount, final int size) {
        return null;
    }

    public static GamePreInitializationEvent createGamePreInitializationEvent(final Cause cause) {
        return null;
    }

    public static PlaySoundEvent.AtEntity createPlaySoundEventAtEntity(final Cause cause, final Location location, final Optional player, final SoundCategory soundCategory, final SoundType soundType, final float pitch, final float volume) {
        return null;
    }

    public static SendCommandEvent createSendCommandEvent(final Cause cause, final String arguments, final String command, final CommandResult result) {
        return null;
    }

    public static EnchantItemEvent.CalculateEnchantment createEnchantItemEventCalculateEnchantment(final Cause cause, final List originalEnchantments, final List enchantments, final ItemStackSnapshot item, final Container targetInventory, final int levelRequirement, final int option, final int seed) {
        return null;
    }

    public static TargetPlayerEvent createTargetPlayerEvent(final Cause cause, final Player targetEntity) {
        return null;
    }

    public static GameConstructionEvent createGameConstructionEvent(final Cause cause) {
        return null;
    }

    public static UnloadChunkEvent createUnloadChunkEvent(final Cause cause, final Chunk targetChunk) {
        return null;
    }

    public static UnforcedChunkEvent createUnforcedChunkEvent(final Cause cause, final Vector3i chunkCoords, final ChunkTicketManager.LoadingTicket ticket) {
        return null;
    }

    public static BanIpEvent createBanIpEvent(final Cause cause, final Ban.Ip ban) {
        return null;
    }

    public static AdvancementTreeEvent.GenerateLayout createAdvancementTreeEventGenerateLayout(final Cause cause, final TreeLayout layout, final AdvancementTree tree) {
        return null;
    }

    public static ExplosionEvent.Detonate createExplosionEventDetonate(final Cause cause, final List affectedLocations, final List entities, final Explosion explosion, final World targetWorld) {
        return null;
    }

    public static LeashEntityEvent createLeashEntityEvent(final Cause cause, final Entity targetEntity) {
        return null;
    }

    public static ConstructPortalEvent createConstructPortalEvent(final Cause cause, final Location portalLocation) {
        return null;
    }

    public static HandInteractEvent createHandInteractEvent(final Cause cause, final HandType handType, final Optional interactionPoint) {
        return null;
    }

    public static AffectEntityEvent createAffectEntityEvent(final Cause cause, final List entities) {
        return null;
    }

    public static GameStoppedEvent createGameStoppedEvent(final Cause cause) {
        return null;
    }

    public static ChangeEntityEquipmentEvent.TargetLiving createChangeEntityEquipmentEventTargetLiving(final Cause cause, final Living targetEntity, final Slot targetInventory, final Transaction transaction) {
        return null;
    }

    public static HarvestEntityEvent.TargetLiving createHarvestEntityEventTargetLiving(final Cause cause, final ImmutableExperienceHolderData originalData, final ExperienceHolderData finalData, final Living targetEntity) {
        return null;
    }

    public static InteractBlockEvent.Primary.MainHand createInteractBlockEventPrimaryMainHand(final Cause cause, final HandType handType, final Optional interactionPoint, final BlockSnapshot targetBlock, final Direction targetSide) {
        return null;
    }

    public static InteractBlockEvent.Secondary.MainHand createInteractBlockEventSecondaryMainHand(final Cause cause, final Tristate originalUseBlockResult, final Tristate useBlockResult, final Tristate originalUseItemResult, final Tristate useItemResult, final HandType handType, final Optional interactionPoint, final BlockSnapshot targetBlock, final Direction targetSide) {
        return null;
    }

    public static CooldownEvent.End createCooldownEventEnd(final Cause cause, final ItemType itemType, final Player targetEntity) {
        return null;
    }

    public static InteractEntityEvent.Primary.MainHand createInteractEntityEventPrimaryMainHand(final Cause cause, final HandType handType, final Optional interactionPoint, final Entity targetEntity) {
        return null;
    }

    public static InteractEntityEvent.Secondary.MainHand createInteractEntityEventSecondaryMainHand(final Cause cause, final HandType handType, final Optional interactionPoint, final Entity targetEntity) {
        return null;
    }

    public static InteractItemEvent.Primary.MainHand createInteractItemEventPrimaryMainHand(final Cause cause, final HandType handType, final Optional interactionPoint, final ItemStackSnapshot itemStack) {
        return null;
    }

    public static InteractItemEvent.Secondary.MainHand createInteractItemEventSecondaryMainHand(final Cause cause, final HandType handType, final Optional interactionPoint, final ItemStackSnapshot itemStack) {
        return null;
    }

    public static TargetLivingEvent createTargetLivingEvent(final Cause cause, final Living targetEntity) {
        return null;
    }

    public static RideEntityEvent.Dismount createRideEntityEventDismount(final Cause cause, final DismountType dismountType, final Entity targetEntity) {
        return null;
    }

    public static ChangeGameModeEvent createChangeGameModeEvent(final Cause cause, final GameMode originalGameMode, final GameMode gameMode, final Humanoid targetEntity) {
        return null;
    }

    public static UnloadWorldEvent createUnloadWorldEvent(final Cause cause, final World targetWorld) {
        return null;
    }

    public static ClickInventoryEvent.NumberPress createClickInventoryEventNumberPress(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions, final int number) {
        return null;
    }

    public static DropItemEvent.Destruct createDropItemEventDestruct(final Cause cause, final List entities) {
        return null;
    }

    public static RconConnectionEvent.Disconnect createRconConnectionEventDisconnect(final Cause cause, final RconSource source) {
        return null;
    }

    public static ClientConnectionEvent.Disconnect createClientConnectionEventDisconnect(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final Player targetEntity, final boolean messageCancelled) {
        return null;
    }

    public static ChangeWorldBorderEvent.TargetWorld createChangeWorldBorderEventTargetWorld(final Cause cause, final Optional newBorder, final Optional previousBorder, final World targetWorld) {
        return null;
    }

    public static TargetBlockEvent createTargetBlockEvent(final Cause cause, final BlockSnapshot targetBlock) {
        return null;
    }

    public static PardonUserEvent createPardonUserEvent(final Cause cause, final Ban.Profile ban, final User targetUser) {
        return null;
    }

    public static AdvancementEvent.Grant createAdvancementEventGrant(final Cause cause, final MessageChannel originalChannel, final Optional channel, final Advancement advancement, final MessageEvent.MessageFormatter formatter, final Player targetEntity, final Instant time, final boolean messageCancelled) {
        return null;
    }

    public static CriterionEvent.Grant createCriterionEventGrant(final Cause cause, final Advancement advancement, final AdvancementCriterion criterion, final Player targetEntity, final Instant time) {
        return null;
    }

    public static CriterionEvent.Score.Grant createCriterionEventScoreGrant(final Cause cause, final Advancement advancement, final ScoreAdvancementCriterion criterion, final Player targetEntity, final Instant time, final int newScore, final int previousScore) {
        return null;
    }

    public static UseItemStackEvent.Replace createUseItemStackEventReplace(final Cause cause, final int originalRemainingDuration, final int remainingDuration, final ItemStackSnapshot itemStackInUse, final Transaction itemStackResult) {
        return null;
    }

    public static TargetFusedExplosiveEvent createTargetFusedExplosiveEvent(final Cause cause, final FusedExplosive targetEntity) {
        return null;
    }

    public static ChangeDataHolderEvent.ValueChange createChangeDataHolderEventValueChange(final Cause cause, final DataTransactionResult originalChanges, final DataHolder targetHolder) {
        return null;
    }

    public static ChangeInventoryEvent.Pickup createChangeInventoryEventPickup(final Cause cause, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static MessageChannelEvent createMessageChannelEvent(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final boolean messageCancelled) {
        return null;
    }

    public static GameStateEvent createGameStateEvent(final Cause cause, final GameState state) {
        return null;
    }

    public static LightningEvent.Post createLightningEventPost(final Cause cause) {
        return null;
    }

    public static SleepingEvent.Post createSleepingEventPost(final Cause cause, final BlockSnapshot bed, final Optional spawnTransform, final Entity targetEntity, final boolean spawnSet) {
        return null;
    }

    public static ChangeBlockEvent.Post createChangeBlockEventPost(final Cause cause, final List transactions) {
        return null;
    }

    public static ChunkPreGenerationEvent.Post createChunkPreGenerationEventPost(final Cause cause, final ChunkPreGenerate chunkPreGenerate, final World targetWorld, final Duration timeTakenForStep, final int chunksGeneratedThisStep, final int chunksSkippedThisStep) {
        return null;
    }

    public static DefuseExplosiveEvent.Post createDefuseExplosiveEventPost(final Cause cause, final FusedExplosive targetEntity) {
        return null;
    }

    public static PrimeExplosiveEvent.Post createPrimeExplosiveEventPost(final Cause cause, final FusedExplosive targetEntity) {
        return null;
    }

    public static SaveWorldEvent.Post createSaveWorldEventPost(final Cause cause, final World targetWorld) {
        return null;
    }

    public static ConstructEntityEvent.Post createConstructEntityEventPost(final Cause cause, final Entity targetEntity, final EntityType targetType, final Transform transform) {
        return null;
    }

    public static ChangeInventoryEvent.Transfer.Post createChangeInventoryEventTransferPost(final Cause cause, final Inventory sourceInventory, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static EnchantItemEvent.Post createEnchantItemEventPost(final Cause cause, final Transaction cursorTransaction, final Slot enchantingSlot, final Optional slot, final Container targetInventory, final List transactions, final int option, final int seed) {
        return null;
    }

    public static PopulateChunkEvent.Post createPopulateChunkEventPost(final Cause cause, final List appliedPopulators, final Chunk targetChunk) {
        return null;
    }

    public static ExplosionEvent.Post createExplosionEventPost(final Cause cause, final Explosion explosion, final List transactions) {
        return null;
    }

    public static GenerateChunkEvent.Post createGenerateChunkEventPost(final Cause cause, final Chunk targetChunk) {
        return null;
    }

    public static ChunkPreGenerationEvent.Cancelled createChunkPreGenerationEventCancelled(final Cause cause, final ChunkPreGenerate chunkPreGenerate, final World targetWorld) {
        return null;
    }

    public static SpawnEntityEvent createSpawnEntityEvent(final Cause cause, final List entities) {
        return null;
    }

    public static ClickInventoryEvent.Middle createClickInventoryEventMiddle(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Drag.Middle createClickInventoryEventDragMiddle(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static NotifyNeighborBlockEvent createNotifyNeighborBlockEvent(final Cause cause, final Map originalNeighbors, final Map neighbors) {
        return null;
    }

    public static TabCompleteEvent.Command createTabCompleteEventCommand(final Cause cause, final List originalTabCompletions, final List tabCompletions, final String arguments, final String command, final String rawMessage, final Optional targetPos, final boolean usingBlock) {
        return null;
    }

    public static ChangeInventoryEvent.Equipment createChangeInventoryEventEquipment(final Cause cause, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static PopulateChunkEvent.Populate createPopulateChunkEventPopulate(final Cause cause, final Populator populator, final Chunk targetChunk) {
        return null;
    }

    public static ChannelRegistrationEvent.Unregister createChannelRegistrationEventUnregister(final Cause cause, final String channel) {
        return null;
    }

    public static SaveWorldEvent createSaveWorldEvent(final Cause cause, final World targetWorld) {
        return null;
    }

    public static TargetExplosiveEvent createTargetExplosiveEvent(final Cause cause, final Explosive targetEntity) {
        return null;
    }

    public static GameStoppingEvent createGameStoppingEvent(final Cause cause) {
        return null;
    }

    public static AITaskEvent.Remove createAITaskEventRemove(final Cause cause, final Goal goal, final Agent targetEntity, final AITask task, final int priority) {
        return null;
    }

    public static ChangeEntityPotionEffectEvent.Remove createChangeEntityPotionEffectEventRemove(final Cause cause, final List currentEffects, final PotionEffect potionEffect, final Entity targetEntity) {
        return null;
    }

    public static AttackEntityEvent createAttackEntityEvent(final Cause cause, final List originalFunctions, final Entity targetEntity, final int knockbackModifier, final double originalDamage) {
        return null;
    }

    public static BreedEntityEvent.ReadyToMate createBreedEntityEventReadyToMate(final Cause cause, final Optional interactionPoint, final Animal targetEntity) {
        return null;
    }

    public static AdvancementEvent.Revoke createAdvancementEventRevoke(final Cause cause, final Advancement advancement, final Player targetEntity) {
        return null;
    }

    public static CriterionEvent.Revoke createCriterionEventRevoke(final Cause cause, final Advancement advancement, final AdvancementCriterion criterion, final Player targetEntity) {
        return null;
    }

    public static CriterionEvent.Score.Revoke createCriterionEventScoreRevoke(final Cause cause, final Advancement advancement, final ScoreAdvancementCriterion criterion, final Player targetEntity, final int newScore, final int previousScore) {
        return null;
    }

    public static LoadChunkEvent createLoadChunkEvent(final Cause cause, final Chunk targetChunk) {
        return null;
    }

    public static ResourcePackStatusEvent createResourcePackStatusEvent(final Cause cause, final ResourcePack pack, final Player player, final ResourcePackStatusEvent.ResourcePackStatus status) {
        return null;
    }

    public static TargetHumanoidEvent createTargetHumanoidEvent(final Cause cause, final Humanoid targetEntity) {
        return null;
    }

    public static BreedEntityEvent.FindMate createBreedEntityEventFindMate(final Cause cause, final TristateResult.Result originalResult, final TristateResult.Result result, final Optional interactionPoint, final Animal matingEntity, final Entity targetEntity, final boolean hasAllowResult) {
        return null;
    }

    public static MoveEntityEvent.Position createMoveEntityEventPosition(final Cause cause, final Transform fromTransform, final Transform toTransform, final Entity targetEntity) {
        return null;
    }

    public static RconConnectionEvent.Connect createRconConnectionEventConnect(final Cause cause, final RconSource source) {
        return null;
    }

    public static RconConnectionEvent.Login createRconConnectionEventLogin(final Cause cause, final RconSource source) {
        return null;
    }

    public static ClientConnectionEvent.Login createClientConnectionEventLogin(final Cause cause, final Transform fromTransform, final Transform toTransform, final RemoteConnection connection, final MessageEvent.MessageFormatter formatter, final GameProfile profile, final User targetUser, final boolean messageCancelled) {
        return null;
    }

    public static BrewingEvent.Interrupt createBrewingEventInterrupt(final Cause cause, final List brewedItemStacks, final ItemStackSnapshot ingredient, final BrewingStand targetTile) {
        return null;
    }

    public static SmeltEvent.Interrupt createSmeltEventInterrupt(final Cause cause, final ItemStackSnapshot fuel, final List smeltedItems, final Furnace targetTile) {
        return null;
    }

    public static GameLoadCompleteEvent createGameLoadCompleteEvent(final Cause cause) {
        return null;
    }

    public static GameStoppingServerEvent createGameStoppingServerEvent(final Cause cause) {
        return null;
    }

    public static PardonIpEvent createPardonIpEvent(final Cause cause, final Ban.Ip ban) {
        return null;
    }

    public static ClientPingServerEvent createClientPingServerEvent(final Cause cause, final StatusClient client, final ClientPingServerEvent.Response response) {
        return null;
    }

    public static LoadWorldEvent createLoadWorldEvent(final Cause cause, final World targetWorld) {
        return null;
    }

    public static ChangeBlockEvent.Break createChangeBlockEventBreak(final Cause cause, final List transactions) {
        return null;
    }

    public static ChangeEntityEquipmentEvent.Break createChangeEntityEquipmentEventBreak(final Cause cause, final Player targetEntity, final Slot targetInventory, final Transaction transaction) {
        return null;
    }

    public static TargetUserEvent createTargetUserEvent(final Cause cause, final User targetUser) {
        return null;
    }

    public static ChunkPreGenerationEvent.Complete createChunkPreGenerationEventComplete(final Cause cause, final ChunkPreGenerate chunkPreGenerate, final World targetWorld) {
        return null;
    }

    public static TickBlockEvent.Scheduled createTickBlockEventScheduled(final Cause cause, final BlockSnapshot targetBlock) {
        return null;
    }

    public static TargetItemEvent createTargetItemEvent(final Cause cause, final Item targetEntity) {
        return null;
    }

    public static IgniteEntityEvent createIgniteEntityEvent(final Cause cause, final int originalFireTicks, final int fireTicks, final Entity targetEntity) {
        return null;
    }

    public static TabCompleteEvent.Chat createTabCompleteEventChat(final Cause cause, final List originalTabCompletions, final List tabCompletions, final String rawMessage, final Optional targetPos, final boolean usingBlock) {
        return null;
    }

    public static MessageChannelEvent.Chat createMessageChannelEventChat(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final Text rawMessage, final boolean messageCancelled) {
        return null;
    }

    public static TargetContainerEvent createTargetContainerEvent(final Cause cause, final Container targetInventory) {
        return null;
    }

    public static ClientConnectionEvent.Join createClientConnectionEventJoin(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final Player targetEntity, final boolean messageCancelled) {
        return null;
    }

    public static SpawnEntityEvent.Custom createSpawnEntityEventCustom(final Cause cause, final List entities) {
        return null;
    }

    public static DropItemEvent.Custom createDropItemEventCustom(final Cause cause, final List entities) {
        return null;
    }

    public static ChangeBlockEvent.Modify createChangeBlockEventModify(final Cause cause, final List transactions) {
        return null;
    }

    public static ChangeLevelEvent createChangeLevelEvent(final Cause cause, final int originalLevel, final int level, final Humanoid targetEntity) {
        return null;
    }

    public static ItemMergeItemEvent createItemMergeItemEvent(final Cause cause, final Item itemToMerge, final Item targetEntity) {
        return null;
    }

    public static ChangeInventoryEvent.Held createChangeInventoryEventHeld(final Cause cause, final Slot finalSlot, final Slot originalSlot, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static ChangeEntityPotionEffectEvent.Gain createChangeEntityPotionEffectEventGain(final Cause cause, final PotionEffect originalPotionEffect, final PotionEffect potionEffect, final List currentEffects, final Entity targetEntity) {
        return null;
    }

    public static ClickInventoryEvent.Recipe.All createClickInventoryEventRecipeAll(final Cause cause, final Transaction cursorTransaction, final Recipe recipe, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static UseItemStackEvent.Reset createUseItemStackEventReset(final Cause cause, final int originalRemainingDuration, final int remainingDuration, final ItemStackSnapshot itemStackInUse) {
        return null;
    }

    public static AnimateHandEvent createAnimateHandEvent(final Cause cause, final HandType handType, final Humanoid targetEntity) {
        return null;
    }

    public static ChangeSignEvent createChangeSignEvent(final Cause cause, final ImmutableSignData originalText, final SignData text, final Sign targetTile) {
        return null;
    }

    public static DetonateExplosiveEvent createDetonateExplosiveEvent(final Cause cause, final Explosion.Builder explosionBuilder, final Explosion originalExplosion, final Explosive targetEntity) {
        return null;
    }

    public static MoveEntityEvent.Teleport createMoveEntityEventTeleport(final Cause cause, final Transform fromTransform, final Transform toTransform, final Entity targetEntity, final boolean keepsVelocity) {
        return null;
    }

    public static RideEntityEvent.Mount createRideEntityEventMount(final Cause cause, final Entity targetEntity) {
        return null;
    }

    public static ClickInventoryEvent.Creative createClickInventoryEventCreative(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Drop.Outside.Creative createClickInventoryEventDropOutsideCreative(final Cause cause, final Transaction cursorTransaction, final List entities, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static CriterionEvent.Trigger createCriterionEventTrigger(final Cause cause, final Advancement advancement, final AdvancementCriterion criterion, final TypeToken genericType, final Player targetEntity, final FilteredTrigger trigger, final boolean result) {
        return null;
    }

    public static TickBlockEvent.Random createTickBlockEventRandom(final Cause cause, final BlockSnapshot targetBlock) {
        return null;
    }

    public static ClickInventoryEvent.Primary createClickInventoryEventPrimary(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Shift.Primary createClickInventoryEventShiftPrimary(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Drop.Outside.Primary createClickInventoryEventDropOutsidePrimary(final Cause cause, final Transaction cursorTransaction, final List entities, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Drag.Primary createClickInventoryEventDragPrimary(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static SmeltEvent.ConsumeFuel createSmeltEventConsumeFuel(final Cause cause, final ItemStackSnapshot fuel, final Furnace targetTile, final List transactions) {
        return null;
    }

    public static SleepingEvent.Tick createSleepingEventTick(final Cause cause, final BlockSnapshot bed, final Entity targetEntity) {
        return null;
    }

    public static BrewingEvent.Tick createBrewingEventTick(final Cause cause, final ItemStackSnapshot ingredient, final BrewingStand targetTile, final List transactions) {
        return null;
    }

    public static SmeltEvent.Tick createSmeltEventTick(final Cause cause, final ItemStackSnapshot fuel, final Furnace targetTile, final List transactions) {
        return null;
    }

    public static UseItemStackEvent.Tick createUseItemStackEventTick(final Cause cause, final int originalRemainingDuration, final int remainingDuration, final ItemStackSnapshot itemStackInUse) {
        return null;
    }

    public static CollideEvent.Impact createCollideEventImpact(final Cause cause, final Location impactPoint) {
        return null;
    }

    public static CollideBlockEvent.Impact createCollideBlockEventImpact(final Cause cause, final Location impactPoint, final BlockState targetBlock, final Location targetLocation, final Direction targetSide) {
        return null;
    }

    public static CollideEntityEvent.Impact createCollideEntityEventImpact(final Cause cause, final List entities, final Location impactPoint) {
        return null;
    }

    public static KickPlayerEvent createKickPlayerEvent(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final Player targetEntity, final boolean messageCancelled) {
        return null;
    }

    public static RespawnPlayerEvent createRespawnPlayerEvent(final Cause cause, final Transform fromTransform, final Transform toTransform, final Player originalPlayer, final Player targetEntity, final boolean bedSpawn, final boolean death) {
        return null;
    }

    public static ExpireEntityEvent.TargetItem createExpireEntityEventTargetItem(final Cause cause, final Item targetEntity) {
        return null;
    }

    public static DropItemEvent.Dispense createDropItemEventDispense(final Cause cause, final List entities) {
        return null;
    }

    public static ChangeWorldGameRuleEvent createChangeWorldGameRuleEvent(final Cause cause, final String originalValue, final String value, final String name, final World targetWorld) {
        return null;
    }

    public static ClickInventoryEvent.Double createClickInventoryEventDouble(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static LaunchProjectileEvent createLaunchProjectileEvent(final Cause cause, final Projectile targetEntity) {
        return null;
    }

    public static DestructEntityEvent.Death createDestructEntityEventDeath(final Cause cause, final MessageChannel originalChannel, final Optional channel, final MessageEvent.MessageFormatter formatter, final Living targetEntity, final boolean keepInventory, final boolean messageCancelled) {
        return null;
    }

    public static GameAboutToStartServerEvent createGameAboutToStartServerEvent(final Cause cause) {
        return null;
    }

    public static QueryServerEvent.Basic createQueryServerEventBasic(final Cause cause, final InetSocketAddress address, final String gameType, final String map, final String motd, final int maxPlayerCount, final int maxSize, final int playerCount, final int size) {
        return null;
    }

    public static MoveEntityEvent createMoveEntityEvent(final Cause cause, final Transform fromTransform, final Transform toTransform, final Entity targetEntity) {
        return null;
    }

    public static ChangeEntityPotionEffectEvent.Expire createChangeEntityPotionEffectEventExpire(final Cause cause, final List currentEffects, final PotionEffect potionEffect, final Entity targetEntity) {
        return null;
    }

    public static ChangeEntityEquipmentEvent.TargetHumanoid createChangeEntityEquipmentEventTargetHumanoid(final Cause cause, final Humanoid targetEntity, final Slot targetInventory, final Transaction transaction) {
        return null;
    }

    public static HarvestEntityEvent.TargetHumanoid createHarvestEntityEventTargetHumanoid(final Cause cause, final ImmutableExperienceHolderData originalData, final ExperienceHolderData finalData, final Humanoid targetEntity) {
        return null;
    }

    public static GamePostInitializationEvent createGamePostInitializationEvent(final Cause cause) {
        return null;
    }

    public static ClientConnectionEvent.Auth createClientConnectionEventAuth(final Cause cause, final RemoteConnection connection, final MessageEvent.MessageFormatter formatter, final GameProfile profile, final boolean messageCancelled) {
        return null;
    }

    public static SleepingEvent.Finish createSleepingEventFinish(final Cause cause, final BlockSnapshot bed, final Entity targetEntity) {
        return null;
    }

    public static BrewingEvent.Finish createBrewingEventFinish(final Cause cause, final List brewedItemStacks, final ItemStackSnapshot ingredient, final BrewingStand targetTile) {
        return null;
    }

    public static SmeltEvent.Finish createSmeltEventFinish(final Cause cause, final ItemStackSnapshot fuel, final List smeltedItems, final Furnace targetTile) {
        return null;
    }

    public static UseItemStackEvent.Finish createUseItemStackEventFinish(final Cause cause, final int originalRemainingDuration, final int remainingDuration, final ItemStackSnapshot itemStackInUse) {
        return null;
    }

    public static ClickInventoryEvent.Secondary createClickInventoryEventSecondary(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Shift.Secondary createClickInventoryEventShiftSecondary(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Drop.Outside.Secondary createClickInventoryEventDropOutsideSecondary(final Cause cause, final Transaction cursorTransaction, final List entities, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Drag.Secondary createClickInventoryEventDragSecondary(final Cause cause, final Transaction cursorTransaction, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static CraftItemEvent.Craft createCraftItemEventCraft(final Cause cause, final ItemStackSnapshot crafted, final CraftingInventory craftingInventory, final Transaction cursorTransaction, final Optional recipe, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static CraftItemEvent.Preview createCraftItemEventPreview(final Cause cause, final CraftingInventory craftingInventory, final SlotTransaction preview, final Optional recipe, final Inventory targetInventory, final List transactions) {
        return null;
    }

    public static ChangeWorldBorderEvent createChangeWorldBorderEvent(final Cause cause, final Optional newBorder, final Optional previousBorder) {
        return null;
    }

    public static LightningEvent.Strike createLightningEventStrike(final Cause cause, final List entities, final List transactions) {
        return null;
    }

    public static CriterionEvent.Score.Change createCriterionEventScoreChange(final Cause cause, final Advancement advancement, final ScoreAdvancementCriterion criterion, final Player targetEntity, final int newScore, final int previousScore) {
        return null;
    }

    public static InteractEvent createInteractEvent(final Cause cause, final Optional interactionPoint) {
        return null;
    }

    public static ClickInventoryEvent.Drop.Single createClickInventoryEventDropSingle(final Cause cause, final Transaction cursorTransaction, final List entities, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static ClickInventoryEvent.Recipe.Single createClickInventoryEventRecipeSingle(final Cause cause, final Transaction cursorTransaction, final Recipe recipe, final Optional slot, final Container targetInventory, final List transactions) {
        return null;
    }

    public static PlayerChangeClientSettingsEvent createPlayerChangeClientSettingsEvent(final Cause cause, final ChatVisibility chatVisibility, final Set displayedSkinParts, final Locale locale, final Player targetEntity, final boolean chatColorsEnabled, final int viewDistance) {
        return null;
    }

    public static CollideEntityEvent createCollideEntityEvent(final Cause cause, final List entities) {
        return null;
    }

    public static UpdateAnvilEvent createUpdateAnvilEvent(final Cause cause, final Transaction costs, final String itemName, final ItemStackSnapshot left, final Transaction result, final ItemStackSnapshot right, final Inventory targetInventory) {
        return null;
    }

    public static ChangeEntityExperienceEvent createChangeEntityExperienceEvent(final Cause cause, final int originalExperience, final int experience, final Entity targetEntity) {
        return ChangeEntityExperienceEvent.createChangeEntityExperienceEvent(cause, originalExperience, experience, targetEntity);
    }

    public static MoveEntityEvent.Teleport.Portal createMoveEntityEventTeleportPortal(final Cause cause, final Transform fromTransform, final Transform toTransform, final PortalAgent portalAgent, final Entity targetEntity, final boolean usePortalAgent) {
        return MoveEntityEvent.Teleport.Portal.createMoveEntityEventTeleportPortal(cause, fromTransform, toTransform, portalAgent, targetEntity, usePortalAgent);
    }

    public static MoveEntityEvent.Teleport createMoveEntityEventTeleport(final Cause cause, final Transform fromTransform, final Transform toTransform, final Entity targetEntity) {
        return MoveEntityEvent.Teleport.createMoveEntityEventTeleport(cause, fromTransform, toTransform, targetEntity);
    }
}

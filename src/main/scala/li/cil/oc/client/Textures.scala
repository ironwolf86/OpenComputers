package li.cil.oc.client

import li.cil.oc.Settings
import net.minecraft.client.resources.{ResourceManager, ResourceManagerReloadListener}
import net.minecraft.util.{Icon, ResourceLocation}

object Textures extends ResourceManagerReloadListener {
  val fontAntiAliased = new ResourceLocation(Settings.resourceDomain, "textures/font/chars.png")
  val fontAliased = new ResourceLocation(Settings.resourceDomain, "textures/font/chars_aliased.png")

  val guiBackground = new ResourceLocation(Settings.resourceDomain, "textures/gui/background.png")
  val guiBorders = new ResourceLocation(Settings.resourceDomain, "textures/gui/borders.png")
  val guiButtonPower = new ResourceLocation(Settings.resourceDomain, "textures/gui/button_power.png")
  val guiButtonRange = new ResourceLocation(Settings.resourceDomain, "textures/gui/button_range.png")
  val guiButtonRun = new ResourceLocation(Settings.resourceDomain, "textures/gui/button_run.png")
  val guiButtonSide = new ResourceLocation(Settings.resourceDomain, "textures/gui/button_side.png")
  val guiComputer = new ResourceLocation(Settings.resourceDomain, "textures/gui/computer.png")
  val guiRange = new ResourceLocation(Settings.resourceDomain, "textures/gui/range.png")
  val guiRobot = new ResourceLocation(Settings.resourceDomain, "textures/gui/robot.png")
  val guiRobotAssembler = new ResourceLocation(Settings.resourceDomain, "textures/gui/robot_assembler.png")
  val guiRobotSelection = new ResourceLocation(Settings.resourceDomain, "textures/gui/robot_selection.png")
  val guiServer = new ResourceLocation(Settings.resourceDomain, "textures/gui/server.png")
  val guiSlot = new ResourceLocation(Settings.resourceDomain, "textures/gui/slot.png")

  val blockCable = new ResourceLocation(Settings.resourceDomain, "textures/blocks/cable.png")
  val blockCaseFrontOn = new ResourceLocation(Settings.resourceDomain, "textures/blocks/case_front_on.png")
  val blockHologram = new ResourceLocation(Settings.resourceDomain, "textures/blocks/hologram_effect.png")
  val blockRackFrontOn = new ResourceLocation(Settings.resourceDomain, "textures/blocks/rack_front_on.png")
  val blockRobot = new ResourceLocation(Settings.resourceDomain, "textures/blocks/robot.png")
  val blockScreenUpIndicator = new ResourceLocation(Settings.resourceDomain, "textures/blocks/screen/up_indicator.png")

  val upgradeCrafting = new ResourceLocation(Settings.resourceDomain, "textures/items/upgrade_crafting_equipped.png")
  val upgradeGenerator = new ResourceLocation(Settings.resourceDomain, "textures/items/upgrade_generator_equipped.png")

  object Charger {
    var iconFrontCharging: Icon = _
    var iconSideCharging: Icon = _
  }

  object Geolyzer {
    var iconTopOn: Icon = _
  }

  object PowerDistributor {
    var iconSideOn: Icon = _
    var iconTopOn: Icon = _
  }

  object Rack {
    val icons = Array.fill[Icon](6)(null)
  }

  object Switch {
    var iconSideActivity: Icon = _
  }

  def onResourceManagerReload(manager: ResourceManager) {
    manager.getResource(fontAntiAliased)
    manager.getResource(fontAliased)

    manager.getResource(guiBackground)
    manager.getResource(guiBorders)
    manager.getResource(guiButtonPower)
    manager.getResource(guiButtonRange)
    manager.getResource(guiButtonRun)
    manager.getResource(guiButtonSide)
    manager.getResource(guiComputer)
    manager.getResource(guiRange)
    manager.getResource(guiRobot)
    manager.getResource(guiRobotAssembler)
    manager.getResource(guiRobotSelection)
    manager.getResource(guiServer)
    manager.getResource(guiSlot)

    manager.getResource(blockCable)
    manager.getResource(blockCaseFrontOn)
    manager.getResource(blockRackFrontOn)
    manager.getResource(blockRobot)
    manager.getResource(blockScreenUpIndicator)

    manager.getResource(upgradeCrafting)
    manager.getResource(upgradeGenerator)
  }
}

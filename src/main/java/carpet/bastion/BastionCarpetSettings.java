package carpet.bastion;

import carpet.settings.Rule;
import static carpet.settings.RuleCategory.*;

public class BastionCarpetSettings {

    public static final String BASTION = "Bastion-Carpet";

    @Rule(desc = "Zombified Piglin drops enchanted golden apple", category = {BASTION, SURVIVAL, FEATURE, EXPERIMENTAL})
    public static boolean zombifiedpiglindropsgoldenapple = false;

    @Rule(desc = "Disable lighting fire", category = {BASTION, FEATURE})
    public static boolean disablelightingfire = false;

    @Rule(desc = "When storm the elder guardian can spawn", category = {BASTION, SURVIVAL, FEATURE, EXPERIMENTAL})
    public static boolean elderguardianspawnonthunder = false;

    @Rule(desc = "Can disable bots load new chunks", category = {BASTION, SURVIVAL, FEATURE, EXPERIMENTAL})
    public static boolean botsLoadChunks = true;

    @Rule(desc = "It's Halloween for Mobs", category = {BASTION, CREATIVE, FEATURE, EXPERIMENTAL})
    public static boolean isHalloween = false;

    @Rule(desc = "Enables /signal command to get a container with comparator value.", category = { BASTION, CREATIVE, COMMAND })
    public static boolean commandSignal = false;

}

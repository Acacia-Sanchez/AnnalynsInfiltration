package org.factoriaf5.infiltration;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake) {
            return false;
        }
        return true;
    } // el return indica si se puede realizar o no el fast attack,
      // si está dormido retorna true al método, que significa que se puede hacer fast
      // attack (ME HA COSTADO ENTENDERLO JEJEJEJE)

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (prisonerIsAwake && !archerIsAwake) {
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        if ((!archerIsAwake && petDogIsPresent) || (prisonerIsAwake && !knightIsAwake && !archerIsAwake)) {
            return true;
        }
        return false;
    }
}
/*
 * Copyright (c) 2024 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MekHQ.
 *
 * MekHQ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MekHQ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MekHQ. If not, see <http://www.gnu.org/licenses/>.
 */
package mekhq.campaign.personnel.randomEvents.enums.personalities;

import java.util.ResourceBundle;

import mekhq.MekHQ;

public enum Ambition {
    // region Enum Declarations
    NONE("Personality.NONE.text", "Personality.NONE.description", false, false),
    AMBITIOUS("Ambition.AMBITIOUS.text", "Ambition.AMBITIOUS.description", true, false),
    ARROGANT("Ambition.ARROGANT.text", "Ambition.ARROGANT.description", false, false),
    ASPIRING("Ambition.ASPIRING.text", "Ambition.ASPIRING.description", true, false),
    CALCULATING("Ambition.CALCULATING.text", "Ambition.CALCULATING.description", true, false),
    CONNIVING("Ambition.CONNIVING.text", "Ambition.CONNIVING.description", false, false),
    CONTROLLING("Ambition.CONTROLLING.text", "Ambition.CONTROLLING.description", false, false),
    CUTTHROAT("Ambition.CUTTHROAT.text", "Ambition.CUTTHROAT.description", false, false),
    DISHONEST("Ambition.DISHONEST.text", "Ambition.DISHONEST.description", false, true),
    DILIGENT("Ambition.DILIGENT.text", "Ambition.DILIGENT.description", true, false),
    DRIVEN("Ambition.DRIVEN.text", "Ambition.DRIVEN.description", true, false),
    ENERGETIC("Ambition.ENERGETIC.text", "Ambition.ENERGETIC.description", true, false),
    EXCESSIVE("Ambition.EXCESSIVE.text", "Ambition.EXCESSIVE.description", false, false),
    FOCUSED("Ambition.FOCUSED.text", "Ambition.FOCUSED.description", true, false),
    GOAL_ORIENTED("Ambition.GOAL_ORIENTED.text", "Ambition.GOAL_ORIENTED.description", true, false),
    INNOVATIVE("Ambition.INNOVATIVE.text", "Ambition.INNOVATIVE.description", true, true),
    MANIPULATIVE("Ambition.MANIPULATIVE.text", "Ambition.MANIPULATIVE.description", false, true),
    MOTIVATED("Ambition.MOTIVATED.text", "Ambition.MOTIVATED.description", true, false),
    OPPORTUNISTIC("Ambition.OPPORTUNISTIC.text", "Ambition.OPPORTUNISTIC.description", true, false),
    OVERCONFIDENT("Ambition.OVERCONFIDENT.text", "Ambition.OVERCONFIDENT.description", false, false),
    PERSISTENT("Ambition.PERSISTENT.text", "Ambition.PERSISTENT.description", true, false),
    PROACTIVE("Ambition.PROACTIVE.text", "Ambition.PROACTIVE.description", true, false),
    RESILIENT("Ambition.RESILIENT.text", "Ambition.RESILIENT.description", true, false),
    RESOURCEFUL("Ambition.RESOURCEFUL.text", "Ambition.RESOURCEFUL.description", true, true),
    RUTHLESS("Ambition.RUTHLESS.text", "Ambition.RUTHLESS.description", false, false),
    SELFISH("Ambition.SELFISH.text", "Ambition.SELFISH.description", false, false),
    STRATEGIC("Ambition.STRATEGIC.text", "Ambition.STRATEGIC.description", true, false),
    TYRANNICAL("Ambition.TYRANNICAL.text", "Ambition.TYRANNICAL.description", false, true),
    UNAMBITIOUS("Ambition.UNAMBITIOUS.text", "Ambition.UNAMBITIOUS.description", false, false),
    UNSCRUPULOUS("Ambition.UNSCRUPULOUS.text", "Ambition.UNSCRUPULOUS.description", false, false),
    VISIONARY("Ambition.VISIONARY.text", "Ambition.VISIONARY.description", true, true);
    // endregion Enum Declarations

    // region Variable Declarations
    private final String name;
    private final String description;
    private final boolean isPositive;
    private final boolean isMajor;
    // endregion Variable Declarations

    // region Constructors
    Ambition(final String name, final String description, boolean isPositive, boolean isMajor) {
        final ResourceBundle resources = ResourceBundle.getBundle("mekhq.resources.Personalities",
                MekHQ.getMHQOptions().getLocale());
        this.name = resources.getString(name);
        this.description = resources.getString(description);
        this.isPositive = isPositive;
        this.isMajor = isMajor;
    }
    // endregion Constructors

    // region Getters

    public String getDescription() {
        return description;
    }

    /**
     * @return {@code true} if the personality trait is considered positive,
     *         {@code false} otherwise.
     */

    public boolean isTraitPositive() {
        return isPositive;
    }

    /**
     * @return {@code true} if the personality trait is considered a major trait,
     *         {@code false} otherwise.
     */

    public boolean isTraitMajor() {
        return isMajor;
    }
    // endregion Getters

    // region Boolean Comparison Methods

    public boolean isNone() {
        return this == NONE;
    }

    public boolean isAmbitious() {
        return this == AMBITIOUS;
    }

    public boolean isArrogant() {
        return this == ARROGANT;
    }

    public boolean isAspiring() {
        return this == ASPIRING;
    }

    public boolean isCalculating() {
        return this == CALCULATING;
    }

    public boolean isConniving() {
        return this == CONNIVING;
    }

    public boolean isControlling() {
        return this == CONTROLLING;
    }

    public boolean isCutthroat() {
        return this == CUTTHROAT;
    }

    public boolean isDishonest() {
        return this == DISHONEST;
    }

    public boolean isDiligent() {
        return this == DILIGENT;
    }

    public boolean isDriven() {
        return this == DRIVEN;
    }

    public boolean isEnergetic() {
        return this == ENERGETIC;
    }

    public boolean isExcessive() {
        return this == EXCESSIVE;
    }

    public boolean isFocused() {
        return this == FOCUSED;
    }

    public boolean isGoalOriented() {
        return this == GOAL_ORIENTED;
    }

    public boolean isInnovative() {
        return this == INNOVATIVE;
    }

    public boolean isManipulative() {
        return this == MANIPULATIVE;
    }

    public boolean isMotivated() {
        return this == MOTIVATED;
    }

    public boolean isOpportunistic() {
        return this == OPPORTUNISTIC;
    }

    public boolean isOverconfident() {
        return this == OVERCONFIDENT;
    }

    public boolean isPersistent() {
        return this == PERSISTENT;
    }

    public boolean isProactive() {
        return this == PROACTIVE;
    }

    public boolean isResilient() {
        return this == RESILIENT;
    }

    public boolean isResourceful() {
        return this == RESOURCEFUL;
    }

    public boolean isRuthless() {
        return this == RUTHLESS;
    }

    public boolean isSelfish() {
        return this == SELFISH;
    }

    public boolean isStrategic() {
        return this == STRATEGIC;
    }

    public boolean isTyrannical() {
        return this == TYRANNICAL;
    }

    public boolean isUnambitious() {
        return this == UNAMBITIOUS;
    }

    public boolean isUnscrupulous() {
        return this == UNSCRUPULOUS;
    }

    public boolean isVisionary() {
        return this == VISIONARY;
    }
    // endregion Boolean Comparison Methods

    // region File I/O
    /**
     * Parses a given string and returns the corresponding Ambition enum.
     * Accepts either the ENUM ordinal value or its name
     *
     * @param ambition the string to be parsed
     * @return the Ambition enum that corresponds to the given string
     * @throws IllegalStateException if the given string does not match any valid
     *                               Ambition
     */

    public static Ambition parseFromString(final String ambition) {
        return switch (ambition) {
            case "0", "None" -> NONE;
            // Minor Characteristics
            case "1", "Ambitious" -> AMBITIOUS;
            case "2", "Arrogant" -> ARROGANT;
            case "3", "Aspiring" -> ASPIRING;
            case "4", "Calculating" -> CALCULATING;
            case "5", "Conniving" -> CONNIVING;
            case "6", "Controlling" -> CONTROLLING;
            case "7", "Cutthroat" -> CUTTHROAT;
            case "8", "Diligent" -> DILIGENT;
            case "9", "Driven" -> DRIVEN;
            case "10", "Energetic" -> ENERGETIC;
            case "11", "Excessive" -> EXCESSIVE;
            case "12", "Focused" -> FOCUSED;
            case "13", "Goal-Oriented" -> GOAL_ORIENTED;
            case "14", "Motivated" -> MOTIVATED;
            case "15", "Opportunistic" -> OPPORTUNISTIC;
            case "16", "Overconfident" -> OVERCONFIDENT;
            case "17", "Persistent" -> PERSISTENT;
            case "18", "Proactive" -> PROACTIVE;
            case "19", "Resilient" -> RESILIENT;
            case "20", "Ruthless" -> RUTHLESS;
            case "21", "Selfish" -> SELFISH;
            case "22", "Strategic" -> STRATEGIC;
            case "23", "Unambitious" -> UNAMBITIOUS;
            case "24", "Unscrupulous" -> UNSCRUPULOUS;
            // Major Characteristics
            case "25", "Dishonest" -> DISHONEST;
            case "26", "Innovative" -> INNOVATIVE;
            case "27", "Manipulative" -> MANIPULATIVE;
            case "28", "Resourceful" -> RESOURCEFUL;
            case "29", "Tyrannical" -> TYRANNICAL;
            case "30", "Visionary" -> VISIONARY;
            default ->
                throw new IllegalStateException(
                        "Unexpected value in mekhq/campaign/personnel/enums/randomEvents/personalities/Ambition.java/parseFromString: "
                                + ambition);
        };
    }

    /**
     * Parses an integer value into an Aggression enum.
     *
     * @param ambition the integer value representing the Ambition level
     * @return the corresponding Ambition enum value
     * @throws IllegalStateException if the integer value does not correspond to any
     *                               valid Ambition enum value
     */

    public static Ambition parseFromInt(final int ambition) {
        return switch (ambition) {
            case 0 -> NONE;
            // Minor Characteristics
            case 1 -> AMBITIOUS;
            case 2 -> ARROGANT;
            case 3 -> ASPIRING;
            case 4 -> CALCULATING;
            case 5 -> CONNIVING;
            case 6 -> CONTROLLING;
            case 7 -> CUTTHROAT;
            case 8 -> DILIGENT;
            case 9 -> DRIVEN;
            case 10 -> ENERGETIC;
            case 11 -> EXCESSIVE;
            case 12 -> FOCUSED;
            case 13 -> GOAL_ORIENTED;
            case 14 -> MOTIVATED;
            case 15 -> OPPORTUNISTIC;
            case 16 -> OVERCONFIDENT;
            case 17 -> PERSISTENT;
            case 18 -> PROACTIVE;
            case 19 -> RESILIENT;
            case 20 -> RUTHLESS;
            case 21 -> SELFISH;
            case 22 -> STRATEGIC;
            case 23 -> UNAMBITIOUS;
            case 24 -> UNSCRUPULOUS;
            // Major Characteristics
            case 25 -> DISHONEST;
            case 26 -> INNOVATIVE;
            case 27 -> MANIPULATIVE;
            case 28 -> RESOURCEFUL;
            case 29 -> TYRANNICAL;
            case 30 -> VISIONARY;
            default ->
                throw new IllegalStateException(
                        "Unexpected value in mekhq/campaign/personnel/enums/randomEvents/personalities/Ambition.java/parseFromInt: "
                                + ambition);
        };
    }

    @Override
    public String toString() {
        return name;
    }
}

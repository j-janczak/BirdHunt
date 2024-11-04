package pl.jojczak.birdhunt.assetsloader

enum class Asset {
    I18N,
    UI_SKIN,
    UI_BULLET,
    UI_S_PEN,
    TX_LOGO,
    TX_BIRD,
    TX_SCOPE,
    TX_SHOTGUN,
    TX_BULLET,
    TX_BG_FAR_LANDS,
    TX_BG_FAR_LANDS_2,
    TX_BG_MOUNTAIN,
    TX_BG_FOG,
    TX_BG_CLOUDS,
    TX_CONTROL_S_PEN,
    TX_CONTROL_TOUCH,
    SN_START_COUNTDOWN,
    SN_GUN_SHOT,
    SN_GUN_RELOAD,
    SN_BIRD_FALLING,
    SN_BIRD_FLYING,
    SN_LVL_UP,
    SN_GAME_OVER;

    companion object {
        const val FONT_46 = "PixelifySans-46"
        const val FONT_46_BORDERED = "PixelifySans-46-bordered"
        const val FONT_75 = "PixelifySans-75"
        const val FONT_75_BORDERED = "PixelifySans-75-bordered"
        const val FONT_180_BORDERED = "PixelifySans-180-bordered"
    }
}

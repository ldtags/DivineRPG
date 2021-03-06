package naturix.divinerpg.utils;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class Utils {
	public static int MINS2TICKS(int mins) {
		return mins * 1200;
		}

		public static int SECS2TICKS(int secs) {
		return secs * 20;
		}
		private static String str;
		private static Object args;
		public static ITextComponent getChatComponent(String str) {
	        TextComponentString ret = new TextComponentString(str);
	        return ret;
	    }
		public static TextComponentString addChatMessage(String str, Object... args) {
	        TextComponentString ret = new TextComponentString(args + str);
	        ret.getStyle().setColor(TextFormatting.WHITE);
	        return ret; 
	    }
		public static ITextComponent getChatComponent(String str, String args) {
			TextComponentString ret = new TextComponentString(args + str);
	        ret.getStyle().setColor(TextFormatting.WHITE);
	        return ret;
		}
		public static String BLACK = "\u00a70", DARK_BLUE = "\u00a71", DARK_GREEN = "\u00a72", DARK_AQUA = "\u00a73", DARK_RED = "\u00a74";
	    public static String DARK_PURPLE = "\u00a75", GOLD = "\u00a76", GRAY = "\u00a77", DARK_GRAY = "\u00a78", BLUE = "\u00a79";
	    public static String GREEN       = "\u00a7a", AQUA = "\u00a7b", RED = "\u00a7c", LIGHT_PURPLE = "\u00a7d", YELLOW = "\u00a7e";
	    public static String WHITE       = "\u00a7f";

	    private static final String[] devs = { "RadioactiveStud", "Eternaldoom1", "BossLetsPlays", "Xolova", "sheenrox82", "The_SlayerMC", "insanity414all", "deathman12e3", "Fire_Sight", "krwminer", "NicosaurusRex99" };

	    @SuppressWarnings("unlikely-arg-type")
		public static boolean isDeveloperName(ITextComponent iTextComponent) {
			for(int i = 0; i < devs.length; i++){
				if(iTextComponent.equals(devs[i]))return true;
			}
			return false;
		}

		public static ITextComponent addChatMessage(ITextComponent displayName) {
			TextComponentString ret = new TextComponentString(args + str);
	        ret.getStyle().setColor(TextFormatting.WHITE);
	        return ret; 
		}

		
	    }

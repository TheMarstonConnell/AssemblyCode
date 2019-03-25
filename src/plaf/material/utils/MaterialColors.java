package plaf.material.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.SwingUtilities;

import com.mic.assembly.AssemblyMachine;

public class MaterialColors {
	
	boolean dark = false;
	
	public static final Color RED_50 = new Color (255, 235, 238);
	public static final Color RED_100 = new Color (255, 205, 210);
	public static final Color RED_200 = new Color (239, 154, 154);
	public static final Color RED_300 = new Color (229, 115, 115);
	public static final Color RED_400 = new Color (239, 83, 80);
	public static final Color RED_500 = new Color (244, 67, 54);
	public static final Color RED_600 = new Color (229, 57, 53);
	public static final Color RED_700 = new Color (211, 47, 47);
	public static final Color RED_800 = new Color (198, 40, 40);
	public static final Color RED_900 = new Color (183, 28, 28);
	public static final Color RED_A100 = new Color (255, 138, 128);
	public static final Color RED_A200 = new Color (255, 82, 82);
	public static final Color RED_A400 = new Color (255, 23, 68);
	public static final Color RED_A700 = new Color (213, 0, 0);
	public static final Color PINK_50 = new Color (252, 228, 236);
	public static final Color PINK_100 = new Color (248, 187, 208);
	public static final Color PINK_200 = new Color (244, 143, 177);
	public static final Color PINK_300 = new Color (240, 98, 146);
	public static final Color PINK_400 = new Color (236, 64, 122);
	public static final Color PINK_500 = new Color (233, 30, 99);
	public static final Color PINK_600 = new Color (216, 27, 96);
	public static final Color PINK_700 = new Color (194, 24, 91);
	public static final Color PINK_800 = new Color (173, 20, 87);
	public static final Color PINK_900 = new Color (136, 14, 79);
	public static final Color PINK_A100 = new Color (255, 128, 171);
	public static final Color PINK_A200 = new Color (255, 64, 129);
	public static final Color PINK_A400 = new Color (245, 0, 87);
	public static final Color PINK_A700 = new Color (197, 17, 98);
	public static final Color PURPLE_50 = new Color (243, 229, 245);
	public static final Color PURPLE_100 = new Color (225, 190, 231);
	public static final Color PURPLE_200 = new Color (206, 147, 216);
	public static final Color PURPLE_300 = new Color (186, 104, 200);
	public static final Color PURPLE_400 = new Color (171, 71, 188);
	public static final Color PURPLE_500 = new Color (156, 39, 176);
	public static final Color PURPLE_600 = new Color (142, 36, 170);
	public static final Color PURPLE_700 = new Color (123, 31, 162);
	public static final Color PURPLE_800 = new Color (106, 27, 154);
	public static final Color PURPLE_900 = new Color (74, 20, 140);
	public static final Color PURPLE_A100 = new Color (234, 128, 252);
	public static final Color PURPLE_A200 = new Color (224, 64, 251);
	public static final Color PURPLE_A400 = new Color (213, 0, 249);
	public static final Color PURPLE_A700 = new Color (170, 0, 255);
	public static final Color DEEP_PURPLE_50 = new Color (237, 231, 246);
	public static final Color DEEP_PURPLE_100 = new Color (209, 196, 233);
	public static final Color DEEP_PURPLE_200 = new Color (179, 157, 219);
	public static final Color DEEP_PURPLE_300 = new Color (149, 117, 205);
	public static final Color DEEP_PURPLE_400 = new Color (126, 87, 194);
	public static final Color DEEP_PURPLE_500 = new Color (103, 58, 183);
	public static final Color DEEP_PURPLE_600 = new Color (94, 53, 177);
	public static final Color DEEP_PURPLE_700 = new Color (81, 45, 168);
	public static final Color DEEP_PURPLE_800 = new Color (69, 39, 160);
	public static final Color DEEP_PURPLE_900 = new Color (49, 27, 146);
	public static final Color DEEP_PURPLE_A100 = new Color (179, 136, 255);
	public static final Color DEEP_PURPLE_A200 = new Color (124, 77, 255);
	public static final Color DEEP_PURPLE_A400 = new Color (101, 31, 255);
	public static final Color DEEP_PURPLE_A700 = new Color (98, 0, 234);
	public static final Color INDIGO_50 = new Color (232, 234, 246);
	public static final Color INDIGO_100 = new Color (197, 202, 233);
	public static final Color INDIGO_200 = new Color (159, 168, 218);
	public static final Color INDIGO_300 = new Color (121, 134, 203);
	public static final Color INDIGO_400 = new Color (92, 107, 192);
	public static final Color INDIGO_500 = new Color (63, 81, 181);
	public static final Color INDIGO_600 = new Color (57, 73, 171);
	public static final Color INDIGO_700 = new Color (48, 63, 159);
	public static final Color INDIGO_800 = new Color (40, 53, 147);
	public static final Color INDIGO_900 = new Color (26, 35, 126);
	public static final Color INDIGO_A100 = new Color (140, 158, 255);
	public static final Color INDIGO_A200 = new Color (83, 109, 254);
	public static final Color INDIGO_A400 = new Color (61, 90, 254);
	public static final Color INDIGO_A700 = new Color (48, 79, 254);
	public static final Color BLUE_50 = new Color (227, 242, 253);
	public static final Color BLUE_100 = new Color (187, 222, 251);
	public static final Color BLUE_200 = new Color (144, 202, 249);
	public static final Color BLUE_300 = new Color (100, 181, 246);
	public static final Color BLUE_400 = new Color (66, 165, 245);
	public static final Color BLUE_500 = new Color (33, 150, 243);
	public static final Color BLUE_600 = new Color (30, 136, 229);
	public static final Color BLUE_700 = new Color (25, 118, 210);
	public static final Color BLUE_800 = new Color (21, 101, 192);
	public static final Color BLUE_900 = new Color (13, 71, 161);
	public static final Color BLUE_A100 = new Color (130, 177, 255);
	public static final Color BLUE_A200 = new Color (68, 138, 255);
	public static final Color BLUE_A400 = new Color (41, 121, 255);
	public static final Color BLUE_A700 = new Color (41, 98, 255);
	public static final Color LIGHT_BLUE_50 = new Color (225, 245, 254);
	public static final Color LIGHT_BLUE_100 = new Color (179, 229, 252);
	public static final Color LIGHT_BLUE_200 = new Color (129, 212, 250);
	public static final Color LIGHT_BLUE_300 = new Color (79, 195, 247);
	public static final Color LIGHT_BLUE_400 = new Color (41, 182, 246);
	public static final Color LIGHT_BLUE_500 = new Color (3, 169, 244);
	public static final Color LIGHT_BLUE_600 = new Color (3, 155, 229);
	public static final Color LIGHT_BLUE_700 = new Color (2, 136, 209);
	public static final Color LIGHT_BLUE_800 = new Color (2, 119, 189);
	public static final Color LIGHT_BLUE_900 = new Color (1, 87, 155);
	public static final Color LIGHT_BLUE_A100 = new Color (128, 216, 255);
	public static final Color LIGHT_BLUE_A200 = new Color (64, 196, 255);
	public static final Color LIGHT_BLUE_A400 = new Color (0, 176, 255);
	public static final Color LIGHT_BLUE_A700 = new Color (0, 145, 234);
	public static final Color CYAN_50 = new Color (224, 247, 250);
	public static final Color CYAN_100 = new Color (178, 235, 242);
	public static final Color CYAN_200 = new Color (128, 222, 234);
	public static final Color CYAN_300 = new Color (77, 208, 225);
	public static final Color CYAN_400 = new Color (38, 198, 218);
	public static final Color CYAN_500 = new Color (0, 188, 212);
	public static final Color CYAN_600 = new Color (0, 172, 193);
	public static final Color CYAN_700 = new Color (0, 151, 167);
	public static final Color CYAN_800 = new Color (0, 131, 143);
	public static final Color CYAN_900 = new Color (0, 96, 100);
	public static final Color CYAN_A100 = new Color (132, 255, 255);
	public static final Color CYAN_A200 = new Color (24, 255, 255);
	public static final Color CYAN_A400 = new Color (0, 229, 255);
	public static final Color CYAN_A700 = new Color (0, 184, 212);
	public static final Color TEAL_50 = new Color (224, 242, 241);
	public static final Color TEAL_100 = new Color (178, 223, 219);
	public static final Color TEAL_200 = new Color (128, 203, 196);
	public static final Color TEAL_300 = new Color (77, 182, 172);
	public static final Color TEAL_400 = new Color (38, 166, 154);
	public static final Color TEAL_500 = new Color (0, 150, 136);
	public static final Color TEAL_600 = new Color (0, 137, 123);
	public static final Color TEAL_700 = new Color (0, 121, 107);
	public static final Color TEAL_800 = new Color (0, 105, 92);
	public static final Color TEAL_900 = new Color (0, 77, 64);
	public static final Color TEAL_A100 = new Color (167, 255, 235);
	public static final Color TEAL_A200 = new Color (100, 255, 218);
	public static final Color TEAL_A400 = new Color (29, 233, 182);
	public static final Color TEAL_A700 = new Color (0, 191, 165);
	public static final Color GREEN_50 = new Color (232, 245, 233);
	public static final Color GREEN_100 = new Color (200, 230, 201);
	public static final Color GREEN_200 = new Color (165, 214, 167);
	public static final Color GREEN_300 = new Color (129, 199, 132);
	public static final Color GREEN_400 = new Color (102, 187, 106);
	public static final Color GREEN_500 = new Color (76, 175, 80);
	public static final Color GREEN_600 = new Color (67, 160, 71);
	public static final Color GREEN_700 = new Color (56, 142, 60);
	public static final Color GREEN_800 = new Color (46, 125, 50);
	public static final Color GREEN_900 = new Color (27, 94, 32);
	public static final Color GREEN_A100 = new Color (185, 246, 202);
	public static final Color GREEN_A200 = new Color (105, 240, 174);
	public static final Color GREEN_A400 = new Color (0, 230, 118);
	public static final Color GREEN_A700 = new Color (0, 200, 83);
	public static final Color LIGHT_GREEN_50 = new Color (241, 248, 233);
	public static final Color LIGHT_GREEN_100 = new Color (220, 237, 200);
	public static final Color LIGHT_GREEN_200 = new Color (197, 225, 165);
	public static final Color LIGHT_GREEN_300 = new Color (174, 213, 129);
	public static final Color LIGHT_GREEN_400 = new Color (156, 204, 101);
	public static final Color LIGHT_GREEN_500 = new Color (139, 195, 74);
	public static final Color LIGHT_GREEN_600 = new Color (124, 179, 66);
	public static final Color LIGHT_GREEN_700 = new Color (104, 159, 56);
	public static final Color LIGHT_GREEN_800 = new Color (85, 139, 47);
	public static final Color LIGHT_GREEN_900 = new Color (51, 105, 30);
	public static final Color LIGHT_GREEN_A100 = new Color (204, 255, 144);
	public static final Color LIGHT_GREEN_A200 = new Color (178, 255, 89);
	public static final Color LIGHT_GREEN_A400 = new Color (118, 255, 3);
	public static final Color LIGHT_GREEN_A700 = new Color (100, 221, 23);
	public static final Color LIME_50 = new Color (249, 251, 231);
	public static final Color LIME_100 = new Color (240, 244, 195);
	public static final Color LIME_200 = new Color (230, 238, 156);
	public static final Color LIME_300 = new Color (220, 231, 117);
	public static final Color LIME_400 = new Color (212, 225, 87);
	public static final Color LIME_500 = new Color (205, 220, 57);
	public static final Color LIME_600 = new Color (192, 202, 51);
	public static final Color LIME_700 = new Color (175, 180, 43);
	public static final Color LIME_800 = new Color (158, 157, 36);
	public static final Color LIME_900 = new Color (130, 119, 23);
	public static final Color LIME_A100 = new Color (244, 255, 129);
	public static final Color LIME_A200 = new Color (238, 255, 65);
	public static final Color LIME_A400 = new Color (198, 255, 0);
	public static final Color LIME_A700 = new Color (174, 234, 0);
	public static final Color YELLOW_50 = new Color (255, 253, 231);
	public static final Color YELLOW_100 = new Color (255, 249, 196);
	public static final Color YELLOW_200 = new Color (255, 245, 157);
	public static final Color YELLOW_300 = new Color (255, 241, 118);
	public static final Color YELLOW_400 = new Color (255, 238, 88);
	public static final Color YELLOW_500 = new Color (255, 235, 59);
	public static final Color YELLOW_600 = new Color (253, 216, 53);
	public static final Color YELLOW_700 = new Color (251, 192, 45);
	public static final Color YELLOW_800 = new Color (249, 168, 37);
	public static final Color YELLOW_900 = new Color (245, 127, 23);
	public static final Color YELLOW_A100 = new Color (255, 255, 141);
	public static final Color YELLOW_A200 = new Color (255, 255, 0);
	public static final Color YELLOW_A400 = new Color (255, 234, 0);
	public static final Color YELLOW_A700 = new Color (255, 214, 0);
	public static final Color AMBER_50 = new Color (255, 248, 225);
	public static final Color AMBER_100 = new Color (255, 236, 179);
	public static final Color AMBER_200 = new Color (255, 224, 130);
	public static final Color AMBER_300 = new Color (255, 213, 79);
	public static final Color AMBER_400 = new Color (255, 202, 40);
	public static final Color AMBER_500 = new Color (255, 193, 7);
	public static final Color AMBER_600 = new Color (255, 179, 0);
	public static final Color AMBER_700 = new Color (255, 160, 0);
	public static final Color AMBER_800 = new Color (255, 143, 0);
	public static final Color AMBER_900 = new Color (255, 111, 0);
	public static final Color AMBER_A100 = new Color (255, 229, 127);
	public static final Color AMBER_A200 = new Color (255, 215, 64);
	public static final Color AMBER_A400 = new Color (255, 196, 0);
	public static final Color AMBER_A700 = new Color (255, 171, 0);
	public static final Color ORANGE_50 = new Color (255, 243, 224);
	public static final Color ORANGE_100 = new Color (255, 224, 178);
	public static final Color ORANGE_200 = new Color (255, 204, 128);
	public static final Color ORANGE_300 = new Color (255, 183, 77);
	public static final Color ORANGE_400 = new Color (255, 167, 38);
	public static final Color ORANGE_500 = new Color (255, 152, 0);
	public static final Color ORANGE_600 = new Color (251, 140, 0);
	public static final Color ORANGE_700 = new Color (245, 124, 0);
	public static final Color ORANGE_800 = new Color (239, 108, 0);
	public static final Color ORANGE_900 = new Color (230, 81, 0);
	public static final Color ORANGE_A100 = new Color (255, 209, 128);
	public static final Color ORANGE_A200 = new Color (255, 171, 64);
	public static final Color ORANGE_A400 = new Color (255, 145, 0);
	public static final Color ORANGE_A700 = new Color (255, 109, 0);
	public static final Color DEEP_ORANGE_50 = new Color (251, 233, 231);
	public static final Color DEEP_ORANGE_100 = new Color (255, 204, 188);
	public static final Color DEEP_ORANGE_200 = new Color (255, 171, 145);
	public static final Color DEEP_ORANGE_300 = new Color (255, 138, 101);
	public static final Color DEEP_ORANGE_400 = new Color (255, 112, 67);
	public static final Color DEEP_ORANGE_500 = new Color (255, 87, 34);
	public static final Color DEEP_ORANGE_600 = new Color (244, 81, 30);
	public static final Color DEEP_ORANGE_700 = new Color (230, 74, 25);
	public static final Color DEEP_ORANGE_800 = new Color (216, 67, 21);
	public static final Color DEEP_ORANGE_900 = new Color (191, 54, 12);
	public static final Color DEEP_ORANGE_A100 = new Color (255, 158, 128);
	public static final Color DEEP_ORANGE_A200 = new Color (255, 110, 64);
	public static final Color DEEP_ORANGE_A400 = new Color (255, 61, 0);
	public static final Color DEEP_ORANGE_A700 = new Color (221, 44, 0);
	public static final Color BROWN_50 = new Color (239, 235, 233);
	public static final Color BROWN_100 = new Color (215, 204, 200);
	public static final Color BROWN_200 = new Color (188, 170, 164);
	public static final Color BROWN_300 = new Color (161, 136, 127);
	public static final Color BROWN_400 = new Color (141, 110, 99);
	public static final Color BROWN_500 = new Color (121, 85, 72);
	public static final Color BROWN_600 = new Color (109, 76, 65);
	public static final Color BROWN_700 = new Color (93, 64, 55);
	public static final Color BROWN_800 = new Color (78, 52, 46);
	public static final Color BROWN_900 = new Color (62, 39, 35);
	public static final Color GRAY_50 = new Color (250, 250, 250);
	public static final Color GRAY_100 = new Color (245, 245, 245);
	public static final Color GRAY_200 = new Color (238, 238, 238);
	public static final Color GRAY_300 = new Color (224, 224, 224);
	public static final Color GRAY_400 = new Color (189, 189, 189);
	public static final Color GRAY_500 = new Color (158, 158, 158);
	public static final Color GRAY_600 = new Color (117, 117, 117);
	public static final Color GRAY_700 = new Color (97, 97, 97);
	public static final Color GRAY_800 = new Color (66, 66, 66);
	public static final Color GRAY_900 = new Color (33, 33, 33);
	public static final Color BLUE_GRAY_50 = new Color (236, 239, 241);
	public static final Color BLUE_GRAY_100 = new Color (207, 216, 220);
	public static final Color BLUE_GRAY_200 = new Color (176, 190, 197);
	public static final Color BLUE_GRAY_300 = new Color (144, 164, 174);
	public static final Color BLUE_GRAY_400 = new Color (120, 144, 156);
	public static final Color BLUE_GRAY_500 = new Color (96, 125, 139);
	public static final Color BLUE_GRAY_600 = new Color (84, 110, 122);
	public static final Color BLUE_GRAY_700 = new Color (69, 90, 100);
	public static final Color BLUE_GRAY_800 = new Color (55, 71, 79);
	public static final Color BLUE_GRAY_900 = new Color (38, 50, 56);
	public static final Color BLACK = new Color (0, 0, 0);
	public static final Color WHITE = new Color (255, 255, 255);
	
	public static final Color LIGHT_PRIMARY = new Color(0x29b6f6);
	public static final Color LIGHT_PRIMARY_DARK = new Color(0x0086c3);
	public static final Color LIGHT_PRIMARY_LIGHT = new Color(0x73e8ff);
	
	public static final Color DARK_PRIMARY = new Color(0xad1457);
	public static final Color DARK_PRIMARY_DARK = new Color(0x78002e);
	public static final Color DARK_PRIMARY_LIGHT = new Color(0xe35183);
	
	public static final Color LIGHT_HIGHLIGHT = new Color(232, 242, 254);
	public static final Color DARK_HIGHLIGHT = new Color(232, 242, 254, 30);

	
	public Color currentPrimary = LIGHT_PRIMARY;
	public Color currentPrimaryDark = LIGHT_PRIMARY_DARK;
	public Color currentPrimaryLight = LIGHT_PRIMARY_LIGHT;
	public Color currentBackground = GRAY_100;
	public Color currentAccent = WHITE;
	public Color currentText = BLACK;

	
	public Color currentHightlight = WHITE;

	public MaterialColors (boolean dark) {
		if(dark) {
			currentPrimary = DARK_PRIMARY;
			currentPrimaryDark = DARK_PRIMARY_DARK;
			currentPrimaryLight = DARK_PRIMARY_LIGHT;
			currentBackground = GRAY_800;
			currentAccent = GRAY_900;
			currentText = WHITE;
			currentHightlight = DARK_HIGHLIGHT;
		}else {
			currentPrimary = LIGHT_PRIMARY;
			currentPrimaryDark = LIGHT_PRIMARY_DARK;
			currentPrimaryLight = LIGHT_PRIMARY_LIGHT;
			currentBackground = GRAY_100;
			currentAccent = WHITE;
			currentText = BLACK;
			currentHightlight = LIGHT_HIGHLIGHT;

		}
		
	}

	public static Color bleach (Color color, float amount) {
		int red = (int) ((color.getRed () * (1 - amount) / 255 + amount) * 255);
		int green = (int) ((color.getGreen () * (1 - amount) / 255 + amount) * 255);
		int blue = (int) ((color.getBlue () * (1 - amount) / 255 + amount) * 255);
		return new Color (red, green, blue);
	}
	
	public void setDark(boolean dark) {
		if(dark) {
			currentPrimary = DARK_PRIMARY;
			currentPrimaryDark = DARK_PRIMARY_DARK;
			currentPrimaryLight = DARK_PRIMARY_LIGHT;
			currentBackground = GRAY_900;
			currentAccent = BLACK;
			currentText = WHITE;
		}else {
			currentPrimary = LIGHT_PRIMARY;
			currentPrimaryDark = LIGHT_PRIMARY_DARK;
			currentPrimaryLight = LIGHT_PRIMARY_LIGHT;
			currentBackground = GRAY_100;
			currentAccent = WHITE;
			currentText = BLACK;
		}

	}
	
	public static List<Component> getAllComponents(final Container c) {
	    Component[] comps = c.getComponents();
	    List<Component> compList = new ArrayList<Component>();
	    for (Component comp : comps) {
	      compList.add(comp);
	      if (comp instanceof Container) {
	        compList.addAll(getAllComponents((Container) comp));
	      }
	    }
	    return compList;
	  }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class randomcolorinrange {
    /**
     *Original Post:

     * I have looked around different sources:
     *
     * Creating random colour in Java?
     * How to create a random color in Java
     * How can I randomize colors in Java?
     * “random color generator javascript stack overflow” Code Answer
     * However, none of these answers is what I am searching for.
     *
     * What I am trying to do is to get a randomized color in range of 2 colors, let's say for example purple and pink. With purple being #6A0DAD and pink being #FFC0CB, I want to grab a color in the range of these 2 colors, but a random one. So I'd get for example #D982B5, which is magenta-pink.
     *
     * I have no clue so far where to get started other than making a randomizer.
     * java
     * colors
     *
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println(get_randomHex_inRange("#6A0DAD", "#FFC0CB", "both"));
    }
    /**
     * Prints just like System.out.println(), but calling p() is faster than System.out.println()
     * @param object_to_print anything that System.out.println() can print
     */
    public static void p(Object object_to_print) {
        System.out.println(object_to_print);
    }
    /**
     * Generates a pseudorandom hexadecimal code with optional color name, WITH SYSTEM DIALOGUE to aid the user.
     * For example, the user can ENTER A HEX CODE OR A COLOR NAME and can ASK FOR THE CORRESPONDING COLOR NAME TO BE PRINTED ALONGSIDE THE RANDOM HEXADECIMAL CODE.
     */
    public static void randomHex_inRange(){
        String[]PinkColors={"Pink","LightPink","HotPink","DeepPink","PaleVioletRed","MediumVioletRed"};
        String[]PurpleColors={"Lavender","Thistle","Plum","Orchid","Violet","Fuchsia","Magenta","MediumOrchid","DarkOrchid","DarkViolet","BlueViolet","DarkMagenta","Purple","MediumPurple","MediumSlateBlue","SlateBlue","DarkSlateBlue","RebeccaPurple","Indigo"};
        String[]RedColors={"LightSalmon","Salmon","DarkSalmon","LightCoral","IndianRed","Crimson","Red","FireBrick","DarkRed"};
        String[]OrangeColors={"Orange","DarkOrange","Coral","Tomato","OrangeRed"};
        String[]YellowColors={"Gold","Yellow","LightYellow","LemonChiffon","LightGoldenRodYellow","PapayaWhip","Moccasin","PeachPuff","PaleGoldenRod","Khaki","DarkKhaki"};
        String[]GreenColors={"GreenYellow","Chartreuse","LawnGreen","Lime","LimeGreen","PaleGreen","LightGreen","MediumSpringGreen","SpringGreen","MediumSeaGreen","SeaGreen","ForestGreen","Green","DarkGreen","YellowGreen","OliveDrab","DarkOliveGreen","MediumAquaMarine","DarkSeaGreen","LightSeaGreen","DarkCyan","Teal"};
        String[]CyanColors={"Aqua","Cyan","LightCyan","PaleTurquoise","Aquamarine","Turquoise","MediumTurquoise","DarkTurquoise"};
        String[]BlueColors={"CadetBlue","SteelBlue","LightSteelBlue","LightBlue","PowderBlue","LightSkyBlue","SkyBlue","CornflowerBlue","DeepSkyBlue","DodgerBlue","RoyalBlue","Blue","MediumBlue","DarkBlue","Navy","MidnightBlue"};
        String[]BrownColors={"Cornsilk","BlanchedAlmond","Bisque","NavajoWhite","Wheat","BurlyWood","Tan","RosyBrown","SandyBrown","GoldenRod","DarkGoldenRod","Peru","Chocolate","Olive","SaddleBrown","Sienna","Brown","Maroon"};
        String[]WhiteColors={"White","Snow","HoneyDew","MintCream","Azure","AliceBlue","GhostWhite","WhiteSmoke","SeaShell","Beige","OldLace","FloralWhite","Ivory","AntiqueWhite","Linen","LavenderBlush","MistyRose"};
        String[]GreyColors={"Gainsboro","LightGray","Silver","DarkGray","DimGray","Gray","LightSlateGray","SlateGray","DarkSlateGray","Black"};
        String[][]ColorArray = {
                PinkColors,PurpleColors,RedColors,OrangeColors,YellowColors,GreenColors,CyanColors,BlueColors,BrownColors,WhiteColors,GreyColors
        };
        String[]ColorArrayNames = {
                "Pink","Purple","Red","Orange","Yellow","Green","Cyan","Blue","Brown","White","Grey"
        };
        String[]AllColors={"Pink","LightPink","HotPink","DeepPink","PaleVioletRed","MediumVioletRed","Lavender","Thistle","Plum","Orchid","Violet","Fuchsia","Magenta","MediumOrchid","DarkOrchid","DarkViolet","BlueViolet","DarkMagenta","Purple", "PersonalPurple", "MediumPurple","MediumSlateBlue","SlateBlue","DarkSlateBlue","RebeccaPurple","Indigo","LightSalmon","Salmon","DarkSalmon","LightCoral","IndianRed","Crimson","Red","FireBrick","DarkRed","Orange","DarkOrange","Coral","Tomato","OrangeRed","Gold","Yellow","LightYellow","LemonChiffon","LightGoldenRodYellow","PapayaWhip","Moccasin","PeachPuff","PaleGoldenRod","Khaki","DarkKhaki","GreenYellow","Chartreuse","LawnGreen","Lime","LimeGreen","PaleGreen","LightGreen","MediumSpringGreen","SpringGreen","MediumSeaGreen","SeaGreen","ForestGreen","Green","DarkGreen","YellowGreen","OliveDrab","DarkOliveGreen","MediumAquaMarine","DarkSeaGreen","LightSeaGreen","DarkCyan","Teal","Aqua","Cyan","LightCyan","PaleTurquoise","Aquamarine","Turquoise","MediumTurquoise","DarkTurquoise","CadetBlue","SteelBlue","LightSteelBlue","LightBlue","PowderBlue","LightSkyBlue","SkyBlue","CornflowerBlue","DeepSkyBlue","DodgerBlue","RoyalBlue","Blue","MediumBlue","DarkBlue","Navy","MidnightBlue","Cornsilk","BlanchedAlmond","Bisque","NavajoWhite","Wheat","BurlyWood","Tan","RosyBrown","SandyBrown","GoldenRod","DarkGoldenRod","Peru","Chocolate","Olive","SaddleBrown","Sienna","Brown","Maroon","White","Snow","HoneyDew","MintCream","Azure","AliceBlue","GhostWhite","WhiteSmoke","SeaShell","Beige","OldLace","FloralWhite","Ivory","AntiqueWhite","Linen","LavenderBlush","MistyRose","Gainsboro","LightGray","Silver","DarkGray","DimGray","Gray","LightSlateGray","SlateGray","DarkSlateGray","Black",};
        String[]AllHexadecimals = {
                "#FFC0CB","#FFB6C1","#FF69B4","#FF1493","#DB7093","#C71585","#E6E6FA","#D8BFD8","#DDA0DD","#DA70D6","#EE82EE","#FF00FF","#FF00FF","#BA55D3","#9932CC","#9400D3","#8A2BE2","#8B008B","#800080", "#6A0DAD", "#9370DB","#7B68EE","#6A5ACD","#483D8B","#663399","#4B0082","#FFA07A","#FA8072","#E9967A","#F08080","#CD5C5C","#DC143C","#FF0000","#B22222","#8B0000","#FFA500","#FF8C00","#FF7F50","#FF6347","#FF4500","#FFD700","#FFFF00","#FFFFE0","#FFFACD","#FAFAD2","#FFEFD5","#FFE4B5","#FFDAB9","#EEE8AA","#F0E68C","#BDB76B","#ADFF2F","#7FFF00","#7CFC00","#00FF00","#32CD32","#98FB98","#90EE90","#00FA9A","#00FF7F","#3CB371","#2E8B57","#228B22","#008000","#006400","#9ACD32","#6B8E23","#556B2F","#66CDAA","#8FBC8F","#20B2AA","#008B8B","#008080","#00FFFF","#00FFFF","#E0FFFF","#AFEEEE","#7FFFD4","#40E0D0","#48D1CC","#00CED1","#5F9EA0","#4682B4","#B0C4DE","#ADD8E6","#B0E0E6","#87CEFA","#87CEEB","#6495ED","#00BFFF","#1E90FF","#4169E1","#0000FF","#0000CD","#00008B","#000080","#191970","#FFF8DC","#FFEBCD","#FFE4C4","#FFDEAD","#F5DEB3","#DEB887","#D2B48C","#BC8F8F","#F4A460","#DAA520","#B8860B","#CD853F","#D2691E","#808000","#8B4513","#A0522D","#A52A2A","#800000","#FFFFFF","#FFFAFA","#F0FFF0","#F5FFFA","#F0FFFF","#F0F8FF","#F8F8FF","#F5F5F5","#FFF5EE","#F5F5DC","#FDF5E6","#FFFAF0","#FFFFF0","#FAEBD7","#FAF0E6","#FFF0F5","#FFE4E1","#DCDCDC","#D3D3D3","#C0C0C0","#A9A9A9","#696969","#808080","#778899","#708090","#2F4F4F","#000000"
        };
        Random random = new Random();
        int rand = random.nextInt(AllHexadecimals.length);
        int PseudoRandom = 0;
        int rand2 = 0;
        int FirstBound = 0;
        int SecondBound = 0;
        int max_minus_min = 0;
        int min = 0;
        String colorarrayname = "";
        p("Would you like a pseudorandom color out of the " + AllHexadecimals.length + " hexadecimal colors, or a pseudorandom color in a range? \n" +
                " Type all or range. If you type 'all' and would like the color name in addition to the hex, type 'name' in addition. For example, 'all name'");
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        if (userInput.contains("all")) {
            String PseudoRandomHexadecimal = AllHexadecimals[rand];
            p(PseudoRandomHexadecimal);
            if(userInput.contains("name")) {
                String ColorName = AllColors[rand];
                p(ColorName);
            }
        }
        if(userInput.equalsIgnoreCase("range")){
            p("printing the available hexadecimal colors and names: ");
            for (int i = 0; i < AllHexadecimals.length; i++) {
                String Hexadecimal = AllHexadecimals[i];
                String ColorName = AllColors[i];
                p("Hexadecimal: " + Hexadecimal + " Color Name: "+ ColorName);
            }
            p("^^the available hexadecimal colors and names^^");
            p("You can now enter the two boundaries of the range of colors. \n" +
                    "Would you like to write the boundaries of the range as a hex, or as a color? \n " +
                    "For example, the bounds could be '#6A0DAD' and '#FFC0CB', or 'PersonalPurple' and 'Pink'. \n " +
                    "Type 'hex' or 'color'.If you type 'hex' and would like the color name in addition to the hex, type 'name' in addition. For example, 'hex name'.");
            Scanner in = new Scanner(System.in);
            String userInput2 = in.next();
            if (userInput2.equalsIgnoreCase("hex")) {
                p("enter the first hexadecimal code: ");
                Scanner in3 = new Scanner(System.in);
                String FirstCode = in3.next();
                p("FirstCode: " + FirstCode);
                for (int i = 0; i < AllHexadecimals.length; i++) {
                    String Hexadecimal = AllHexadecimals[i];
                    if (FirstCode.equalsIgnoreCase(Hexadecimal)) {
                        FirstBound += i;
                        p("i: " + i);
                    }
                }
                p("enter the second hexadecimal code: ");
                String SecondCode = in3.next();
                p("SecondCode: " + SecondCode);
                for (int i = 0; i < AllHexadecimals.length; i++) {
                    String Hexadecimal = AllHexadecimals[i];
                    if (SecondCode.equalsIgnoreCase(Hexadecimal)) {
                        SecondBound += i;
                        p("i: " + i);
                    }
                }
            }
            if (userInput2.equalsIgnoreCase("color")) {
                p("enter the first Color Name, for example, PersonalPurple: ");
//                p("if you would like to see the available colors again, you can type 'group' \n" +
//                        "This will display the available colors in that group.");
                Scanner in3 = new Scanner(System.in);
                String FirstColor = in3.next();
//                String input = FirstColor;
//                if (input.equalsIgnoreCase("group")) {
//                    Scanner in4 = new Scanner(System.in);
//                    String input4 = in4.next();
//                    for (int i = 0; i < ColorArray.length; i++) {
//                        String[] colorarray = ColorArray[i];
//                        colorarrayname = ColorArrayNames[i];
//                        if (input4.equalsIgnoreCase(colorarrayname)) {
//                            p(colorarray);
//                        }
//                    }
//                    p("^^Color Group: " + colorarrayname);
//                }
                p("FirstColor: " + FirstColor);
                for (int i = 0; i < AllColors.length; i++) {
                    String ColorName = AllColors[i];
                    if (FirstColor.equalsIgnoreCase(ColorName)) {
                        FirstBound += i;
                        p("i: " + i);
                    }
                }
                p("enter the second hexadecimal Color: ");
                String SecondColor = in3.next();
                p("SecondColor: " + SecondColor);
                for (int i = 0; i < AllColors.length; i++) {
                    String ColorName = AllColors[i];
                    if (SecondColor.equalsIgnoreCase(ColorName)) {
                        SecondBound += i;
                        p("i: " + i);
                    }
                }
            }

            if (SecondBound > FirstBound) {
                max_minus_min = SecondBound-FirstBound;
                min = FirstBound+1;
            }
            if (SecondBound < FirstBound) {
                max_minus_min = FirstBound - SecondBound;
                min=SecondBound+1;
            }
            p(FirstBound+ " " +SecondBound);
            PseudoRandom = min + (int) (Math.random() * max_minus_min);
            String PseudoRandomHexadecimal = AllHexadecimals[PseudoRandom];
            p("PseudoRandom" + PseudoRandom);
            String ColorName = AllColors[PseudoRandom];
            p("PseudoRandom" + PseudoRandom);
            String random_hex_color = "Random Hexadecimal: " + PseudoRandomHexadecimal + " Color Name: " + ColorName;
            p(random_hex_color);

        }
    }

    /**
     *
     * @param FirstCode a String hexadecimal code (#______) OR a color name on either end of the desired range. For example, "#6A0DAD" or "PersonalPurple"
     * @param SecondCode a String hexadecimal code (#______) OR a color name on either end of the desired range. For example, "#FFC0CB" or "Pink"
     *                   Please do not mix the two formats. For example, "#6A0DAD", "#FFC0CB" is ok, and "PersonalPurple", "Pink" is ok, but "#6A0DAD", "Pink" is currently not ok.
     * @param Desired_Return_Format a String specifying whether the method will return the random hex code only, the color name only, or both the random hex and its name.
     *                              Acceptable:
     *                              Return both: "both", "full" or any String containing "and"
     *                              Return hex only: "hex"
     *                              Return name only: "color", "name",
     *
     * @return random_hex_returned in the Desired_Return_Format:
     *
         * Desired_Return_Format: hex only:
             * random_hex_returned = String PseudoRandomHexadecimal
         *
         * Desired_Return_Format: name only:
             * random_hex_returned = String ColorName
         *
         * Desired_Return_Format: both:
             * random_hex_returned = ("Random Hexadecimal: " + PseudoRandomHexadecimal + " Color Name: " + ColorName)
     */
    public static String get_randomHex_inRange(String FirstCode, String SecondCode, String Desired_Return_Format){
        String random_hex_returned = "";
        int FirstBound = 0;
        int SecondBound = 0;
        int max_minus_min = 0;
        int min = 0;
        int PseudoRandom = 0;
        String random_hex_color = "";
        String[]AllColors={"Pink","LightPink","HotPink","DeepPink","PaleVioletRed","MediumVioletRed","Lavender","Thistle","Plum","Orchid","Violet","Fuchsia","Magenta","MediumOrchid","DarkOrchid","DarkViolet","BlueViolet","DarkMagenta","Purple", "PersonalPurple", "MediumPurple","MediumSlateBlue","SlateBlue","DarkSlateBlue","RebeccaPurple","Indigo","LightSalmon","Salmon","DarkSalmon","LightCoral","IndianRed","Crimson","Red","FireBrick","DarkRed","Orange","DarkOrange","Coral","Tomato","OrangeRed","Gold","Yellow","LightYellow","LemonChiffon","LightGoldenRodYellow","PapayaWhip","Moccasin","PeachPuff","PaleGoldenRod","Khaki","DarkKhaki","GreenYellow","Chartreuse","LawnGreen","Lime","LimeGreen","PaleGreen","LightGreen","MediumSpringGreen","SpringGreen","MediumSeaGreen","SeaGreen","ForestGreen","Green","DarkGreen","YellowGreen","OliveDrab","DarkOliveGreen","MediumAquaMarine","DarkSeaGreen","LightSeaGreen","DarkCyan","Teal","Aqua","Cyan","LightCyan","PaleTurquoise","Aquamarine","Turquoise","MediumTurquoise","DarkTurquoise","CadetBlue","SteelBlue","LightSteelBlue","LightBlue","PowderBlue","LightSkyBlue","SkyBlue","CornflowerBlue","DeepSkyBlue","DodgerBlue","RoyalBlue","Blue","MediumBlue","DarkBlue","Navy","MidnightBlue","Cornsilk","BlanchedAlmond","Bisque","NavajoWhite","Wheat","BurlyWood","Tan","RosyBrown","SandyBrown","GoldenRod","DarkGoldenRod","Peru","Chocolate","Olive","SaddleBrown","Sienna","Brown","Maroon","White","Snow","HoneyDew","MintCream","Azure","AliceBlue","GhostWhite","WhiteSmoke","SeaShell","Beige","OldLace","FloralWhite","Ivory","AntiqueWhite","Linen","LavenderBlush","MistyRose","Gainsboro","LightGray","Silver","DarkGray","DimGray","Gray","LightSlateGray","SlateGray","DarkSlateGray","Black",};
        String[]AllHexadecimals = {
                "#FFC0CB","#FFB6C1","#FF69B4","#FF1493","#DB7093","#C71585","#E6E6FA","#D8BFD8","#DDA0DD","#DA70D6","#EE82EE","#FF00FF","#FF00FF","#BA55D3","#9932CC","#9400D3","#8A2BE2","#8B008B","#800080", "#6A0DAD", "#9370DB","#7B68EE","#6A5ACD","#483D8B","#663399","#4B0082","#FFA07A","#FA8072","#E9967A","#F08080","#CD5C5C","#DC143C","#FF0000","#B22222","#8B0000","#FFA500","#FF8C00","#FF7F50","#FF6347","#FF4500","#FFD700","#FFFF00","#FFFFE0","#FFFACD","#FAFAD2","#FFEFD5","#FFE4B5","#FFDAB9","#EEE8AA","#F0E68C","#BDB76B","#ADFF2F","#7FFF00","#7CFC00","#00FF00","#32CD32","#98FB98","#90EE90","#00FA9A","#00FF7F","#3CB371","#2E8B57","#228B22","#008000","#006400","#9ACD32","#6B8E23","#556B2F","#66CDAA","#8FBC8F","#20B2AA","#008B8B","#008080","#00FFFF","#00FFFF","#E0FFFF","#AFEEEE","#7FFFD4","#40E0D0","#48D1CC","#00CED1","#5F9EA0","#4682B4","#B0C4DE","#ADD8E6","#B0E0E6","#87CEFA","#87CEEB","#6495ED","#00BFFF","#1E90FF","#4169E1","#0000FF","#0000CD","#00008B","#000080","#191970","#FFF8DC","#FFEBCD","#FFE4C4","#FFDEAD","#F5DEB3","#DEB887","#D2B48C","#BC8F8F","#F4A460","#DAA520","#B8860B","#CD853F","#D2691E","#808000","#8B4513","#A0522D","#A52A2A","#800000","#FFFFFF","#FFFAFA","#F0FFF0","#F5FFFA","#F0FFFF","#F0F8FF","#F8F8FF","#F5F5F5","#FFF5EE","#F5F5DC","#FDF5E6","#FFFAF0","#FFFFF0","#FAEBD7","#FAF0E6","#FFF0F5","#FFE4E1","#DCDCDC","#D3D3D3","#C0C0C0","#A9A9A9","#696969","#808080","#778899","#708090","#2F4F4F","#000000"
        };
        if (FirstCode.charAt(0) == '#') {
            for (int i = 0; i < AllHexadecimals.length; i++) {
                String Hexadecimal = AllHexadecimals[i];
                if (FirstCode.equalsIgnoreCase(Hexadecimal)) {
                    FirstBound += i;
                }
            }
        }
        if (SecondCode.charAt(0) == '#') {
            for (int i = 0; i < AllHexadecimals.length; i++) {
                String Hexadecimal = AllHexadecimals[i];
                if (SecondCode.equalsIgnoreCase(Hexadecimal)) {
                    SecondBound += i;
                }
            }
        }
        if (!FirstCode.contains("#")) {
            for (int i = 0; i < AllColors.length; i++) {
                String ColorName = AllColors[i];
                if (FirstCode.equalsIgnoreCase(ColorName)) {
                    FirstBound += i;
                }
            }
        }
        if (!SecondCode.contains("#")) {
            for (int i = 0; i < AllColors.length; i++) {
                String ColorName = AllColors[i];
                if (SecondCode.equalsIgnoreCase(ColorName)) {
                    SecondBound += i;
                }
            }
        }
        if (SecondBound > FirstBound) {
            max_minus_min = SecondBound-FirstBound;
            min = FirstBound+1;
        }
        if (SecondBound < FirstBound) {
            max_minus_min = FirstBound - SecondBound;
            min=SecondBound+1;
        }
//        p(FirstBound+ " " +SecondBound);
        PseudoRandom = min + (int) (Math.random() * max_minus_min);
        String PseudoRandomHexadecimal = AllHexadecimals[PseudoRandom];
//        p("PseudoRandom" + PseudoRandom);
        String ColorName = AllColors[PseudoRandom];
//        p("PseudoRandom" + PseudoRandom);
        random_hex_color = "Random Hexadecimal: " + PseudoRandomHexadecimal + " Color Name: " + ColorName;
//        p(random_hex_color);
        if (Desired_Return_Format.contains("hex")) {
            random_hex_returned = (PseudoRandomHexadecimal);
        }
        if (Desired_Return_Format.contains("color") || Desired_Return_Format.contains("name")) {
            random_hex_returned = (ColorName);
        }
        if (Desired_Return_Format.equalsIgnoreCase("both") || Desired_Return_Format.contains("and") || Desired_Return_Format.equalsIgnoreCase("full")) {
            random_hex_returned = random_hex_color;
        }
        return random_hex_returned;
    }
    }


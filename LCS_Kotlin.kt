fun getLCSlength(firstString: String, secString: String, firstlength: Int, secLength: Int): Int {

          // If end of the String is reached
            if (firstlength == 0 || secLength == 0)
                return 0

            // if last char of the 2 Strings matches, remove the char from both the STringa and increment the count by 1 
            if (firstString[firstlength - 1] == secString[secLength - 1])
                return getLCSlength(firstString, secString, firstlength - 1, secLength - 1) + 1
            else
            // If last String does not match, having different combinations by removing a char from one String at a time 
            // and comparing with the other one other; calling the method recursively.
                return Integer.max(
                    getLCSlength(firstString, secString, firstlength - 1, secLength),
                    getLCSlength(firstString, secString, firstlength, secLength - 1)
                )

        }

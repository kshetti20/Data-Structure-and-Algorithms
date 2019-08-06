fun getLCSlength(firstString: String, secString: String, firstlength: Int, secLength: Int): Int {

            for (i in 0..firstlength - 1) {
                Log.e("LCSSEQ", firstString.get(firstlength - 1).toString())
            }

            for (i in 0..secLength - 1) {
                Log.e("LCSSEQ", secString[i].toString())
            }

            if (firstlength == 0 || secLength == 0)
                return 0

            // if last character of the 2 Strings matches
            if (firstString[firstlength - 1] == secString[secLength - 1])
                return getLCSlength(firstString, secString, firstlength - 1, secLength - 1) + 1
            else
                return Integer.max(
                    getLCSlength(firstString, secString, firstlength - 1, secLength),
                    getLCSlength(firstString, secString, firstlength, secLength - 1)
                )

        }

/*
 * SkyTube
 * Copyright (C) 2019  Zsombor Gegesy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation (version 3 of the License).
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package free.rm.skytube.app;

import java.util.Arrays;

public class Utils {

    public static boolean equals(Object a, Object b) {
        return  a == b || (a != null && a.equals(b));
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static int hash(Object... obj) {
        return Arrays.hashCode(obj);
    }
}

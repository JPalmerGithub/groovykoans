/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

class SensitiveService {

    int numberOfNukes = 0

    String nukeCity(String username, String city) {
        numberOfNukes++
        return "$username has ordered to nuke $city. Nuking..."
    }

}

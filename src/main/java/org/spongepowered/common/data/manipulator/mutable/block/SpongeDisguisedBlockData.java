/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.common.data.manipulator.mutable.block;

import static com.google.common.base.Preconditions.checkNotNull;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.immutable.block.ImmutableDisguisedBlockData;
import org.spongepowered.api.data.manipulator.mutable.block.DisguisedBlockData;
import org.spongepowered.api.data.type.DisguisedBlockType;
import org.spongepowered.api.data.type.DisguisedBlockTypes;
import org.spongepowered.common.data.manipulator.immutable.block.ImmutableSpongeDisguisedBlockData;
import org.spongepowered.common.data.manipulator.mutable.common.AbstractSingleCatalogData;

public class SpongeDisguisedBlockData extends AbstractSingleCatalogData<DisguisedBlockType, DisguisedBlockData, ImmutableDisguisedBlockData> implements
        DisguisedBlockData {

    public SpongeDisguisedBlockData(DisguisedBlockType disguisedBlockType) {
        super(DisguisedBlockData.class, checkNotNull(disguisedBlockType), Keys.DISGUISED_BLOCK_TYPE, ImmutableSpongeDisguisedBlockData.class);
    }

    public SpongeDisguisedBlockData() {
        this(DisguisedBlockTypes.STONE);
    }

}

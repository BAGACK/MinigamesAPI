/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.github.mce.minigames.api.util.function;

import java.util.Objects;

import com.github.mce.minigames.api.MinigameException;

/**
 * Similar to {@link java.util.function.LongUnaryOperator} but is able to throw MinigameExceptions.
 * 
 * @author mepeisen
 *
 */
@FunctionalInterface
public interface MgLongUnaryOperator
{
    
    /**
     * Applies this operator to the given operand.
     *
     * @param operand
     *            the operand
     * @return the operator result
     * @throws MinigameException
     *             thrown on problems, f.e. networking errors.
     */
    long applyAsLong(long operand) throws MinigameException;
    
    /**
     * Returns a composed operator that first applies the {@code before} operator to its input, and then applies this operator to the result. If evaluation of either operator throws an exception, it
     * is relayed to the caller of the composed operator.
     *
     * @param before
     *            the operator to apply before this operator is applied
     * @return a composed operator that first applies the {@code before} operator and then applies this operator
     * @throws NullPointerException
     *             if before is null
     *
     * @see #andThen(MgLongUnaryOperator)
     */
    default MgLongUnaryOperator compose(MgLongUnaryOperator before)
    {
        Objects.requireNonNull(before);
        return (long value) -> applyAsLong(before.applyAsLong(value));
    }
    
    /**
     * Returns a composed operator that first applies this operator to its input, and then applies the {@code after} operator to the result. If evaluation of either operator throws an exception, it is
     * relayed to the caller of the composed operator.
     *
     * @param after
     *            the operator to apply after this operator is applied
     * @return a composed operator that first applies this operator and then applies the {@code after} operator
     * @throws NullPointerException
     *             if after is null
     *
     * @see #compose(MgLongUnaryOperator)
     */
    default MgLongUnaryOperator andThen(MgLongUnaryOperator after)
    {
        Objects.requireNonNull(after);
        return (long value) -> after.applyAsLong(applyAsLong(value));
    }
    
    /**
     * Returns a unary operator that always returns its input argument.
     *
     * @return a unary operator that always returns its input argument
     */
    static MgLongUnaryOperator identity()
    {
        return t -> t;
    }
    
}

/**
 * 
 */
package com.yei.server.kernel;

import java.io.Serializable;

/**
 * @author Yurifull
 *
 */
public interface IDaoBase <T, PK extends Serializable>{
	
	/**
	 * Creates the.
	 *
	 * @param t the t
	 * @return the t
	 */
	T create(T t);
	
	/**
	 * Read.
	 *
	 * @param id the id
	 * @return the t
	 */
	T read(PK id);
	
	/**
	 * Update.
	 *
	 * @param t the t
	 * @return the t
	 */
	T update(T t);
	
	/**
	 * Delete.
	 *
	 * @param t the t
	 * @return true, if successful
	 */
	boolean delete(T t);

}

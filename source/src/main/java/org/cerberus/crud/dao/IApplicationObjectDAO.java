/* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Cerberus.
 *
 * Cerberus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cerberus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.cerberus.crud.dao;

import org.cerberus.crud.entity.Application;
import org.cerberus.crud.entity.ApplicationObject;
import org.cerberus.util.answer.Answer;
import org.cerberus.util.answer.AnswerItem;
import org.cerberus.util.answer.AnswerList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Interface that defines the public methods to manage Application data on table
 * Insert, Delete, Update, Find
 *
 * @author tbernardes
 * @version 1.0, 15/10/13
 * @since 0.9.0
 */
public interface IApplicationObjectDAO {

    /**
     *
     * @param id
     * @return
     */
    AnswerItem readByKey(int id);

    /**
     *
     * @param application
     * @param object
     * @return
     */
    AnswerItem readByKey(String application, String object);

    /**
     *
     * @param Application
     * @return
     */
    AnswerList readByApplication(String Application);

    /**
     *
     * @param startPosition
     * @param length
     * @param columnName
     * @param sort
     * @param searchParameter
     * @param individualSearch
     * @return
     */
    AnswerList readByCriteria(int startPosition, int length, String columnName, String sort, String searchParameter, Map<String, List<String>> individualSearch);

    /**
     *
     * @param application
     * @param startPosition
     * @param length
     * @param columnName
     * @param sort
     * @param searchParameter
     * @param individualSearch
     * @return
     */
    AnswerList readByApplicationByCriteria(String application, int startPosition, int length, String columnName, String sort, String searchParameter, Map<String, List<String>> individualSearch);

    /**
     *
     * @param object
     * @return
     */
    Answer create(ApplicationObject object);

    /**
     *
     * @param object
     * @return
     */
    Answer delete(ApplicationObject object);

    /**
     *
     * @param object
     * @return
     */
    Answer update(ApplicationObject object);

    /**
     *
     * @param searchParameter
     * @param individualSearch
     * @param columnName
     * @return
     */
    AnswerList<String> readDistinctValuesByCriteria(String searchParameter, Map<String, List<String>> individualSearch, String columnName);

    /**
     *
     * @param application
     * @param searchParameter
     * @param individualSearch
     * @param columnName
     * @return
     */
    AnswerList<String> readDistinctValuesByApplicationByCriteria(String application, String searchParameter, Map<String, List<String>> individualSearch, String columnName);
}
/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.util;

import static com.alibaba.druid.util.FnvHash.fnv_64_lower;

public interface FnvConstants {
    long HIGH_PRIORITY = fnv_64_lower("HIGH_PRIORITY");
    long DISTINCTROW = fnv_64_lower("DISTINCTROW");
    long STRAIGHT_JOIN = fnv_64_lower("STRAIGHT_JOIN");
    long SQL_SMALL_RESULT = fnv_64_lower("SQL_SMALL_RESULT");
    long SQL_BIG_RESULT = fnv_64_lower("SQL_BIG_RESULT");
    long SQL_BUFFER_RESULT = fnv_64_lower("SQL_BUFFER_RESULT");
    long SQL_CACHE = fnv_64_lower("SQL_CACHE");
    long SQL_NO_CACHE = fnv_64_lower("SQL_NO_CACHE");
    long SQL_CALC_FOUND_ROWS = fnv_64_lower("SQL_CALC_FOUND_ROWS");
    long OUTFILE = fnv_64_lower("OUTFILE");
    long SETS = fnv_64_lower("SETS");
    long REGEXP = fnv_64_lower("REGEXP");
    long RLIKE = fnv_64_lower("RLIKE");
    long USING = fnv_64_lower("USING");
    long IGNORE = fnv_64_lower("IGNORE");
    long FORCE = fnv_64_lower("FORCE");
    long CROSS = fnv_64_lower("CROSS");
    long NATURAL = fnv_64_lower("NATURAL");
    long APPLY = fnv_64_lower("APPLY");
    long CONNECT = fnv_64_lower("CONNECT");
    long START = fnv_64_lower("START");
    long BTREE = fnv_64_lower("BTREE");
    long HASH = fnv_64_lower("HASH");
    long NO_WAIT = fnv_64_lower("NO_WAIT");
    long WAIT = fnv_64_lower("WAIT");
    long NOWAIT = fnv_64_lower("NOWAIT");
    long ERRORS = fnv_64_lower("ERRORS");
    long VALUE = fnv_64_lower("VALUE");
    long NEXT = fnv_64_lower("NEXT");
    long NEXTVAL = fnv_64_lower("NEXTVAL");
    long CURRVAL = fnv_64_lower("CURRVAL");
    long PREVVAL = fnv_64_lower("PREVVAL");
    long PREVIOUS = fnv_64_lower("PREVIOUS");
    long LOW_PRIORITY = fnv_64_lower("LOW_PRIORITY");
    long COMMIT_ON_SUCCESS = fnv_64_lower("COMMIT_ON_SUCCESS");
    long ROLLBACK_ON_FAIL = fnv_64_lower("ROLLBACK_ON_FAIL");
    long QUEUE_ON_PK = fnv_64_lower("QUEUE_ON_PK");
    long TARGET_AFFECT_ROW = fnv_64_lower("TARGET_AFFECT_ROW");
    long COLLATE = fnv_64_lower("COLLATE");
    long BOOLEAN = fnv_64_lower("BOOLEAN");
    long CHARSET = fnv_64_lower("CHARSET");
    long SEMI = fnv_64_lower("SEMI");
    long ANTI = fnv_64_lower("ANTI");
    long PRIOR = fnv_64_lower("PRIOR");
    long NOCYCLE = fnv_64_lower("NOCYCLE");
    long CONNECT_BY_ROOT = fnv_64_lower("CONNECT_BY_ROOT");
    long DATE = fnv_64_lower("DATE");
    long TIMESTAMP = fnv_64_lower("TIMESTAMP");
    long CURRENT = fnv_64_lower("CURRENT");
    long COUNT = fnv_64_lower("COUNT");
    long ROW_NUMBER = fnv_64_lower("ROW_NUMBER");
    long WM_CONAT = fnv_64_lower("WM_CONAT");
    long AVG = fnv_64_lower("AVG");
    long MAX = fnv_64_lower("MAX");
    long MIN = fnv_64_lower("MIN");
    long STDDEV = fnv_64_lower("STDDEV");
    long SUM = fnv_64_lower("SUM");
    long GROUP_CONCAT = fnv_64_lower("GROUP_CONCAT");
    long DEDUPLICATION = fnv_64_lower("DEDUPLICATION");
    long CONVERT = fnv_64_lower("CONVERT");
    long CHAR = fnv_64_lower("CHAR");
    long VARCHAR = fnv_64_lower("VARCHAR");
    long VARCHAR2 = fnv_64_lower("VARCHAR2");
    long NCHAR = fnv_64_lower("NCHAR");
    long NVARCHAR = fnv_64_lower("NVARCHAR");
    long NVARCHAR2 = fnv_64_lower("NVARCHAR2");
    long TINYTEXT = fnv_64_lower("TINYTEXT");
    long TEXT = fnv_64_lower("TEXT");
    long MEDIUMTEXT = fnv_64_lower("MEDIUMTEXT");
    long LONGTEXT = fnv_64_lower("LONGTEXT");
    long TRIM = fnv_64_lower("TRIM");
    long LEADING = fnv_64_lower("LEADING");
    long BOTH = fnv_64_lower("BOTH");
    long TRAILING = fnv_64_lower("TRAILING");
    long MOD = fnv_64_lower("MOD");
    long MATCH = fnv_64_lower("MATCH");
    long EXTRACT = fnv_64_lower("EXTRACT");
    long POSITION = fnv_64_lower("POSITION");
    long DUAL = fnv_64_lower("DUAL");
    long LEVEL = fnv_64_lower("LEVEL");
    long CONNECT_BY_ISCYCLE = fnv_64_lower("CONNECT_BY_ISCYCLE");
    long CURRENT_TIMESTAMP = fnv_64_lower("CURRENT_TIMESTAMP");
    long FALSE = fnv_64_lower("FALSE");
    long TRUE = fnv_64_lower("TRUE");
    long SET = fnv_64_lower("SET");
    long LESS = fnv_64_lower("LESS");
    long MAXVALUE = fnv_64_lower("MAXVALUE");
    long OFFSET = fnv_64_lower("OFFSET");
    long RAW = fnv_64_lower("RAW");
    long LONG = fnv_64_lower("LONG");
    long ROWNUM = fnv_64_lower("ROWNUM");
    long PRECISION = fnv_64_lower("PRECISION");
    long DOUBLE = fnv_64_lower("DOUBLE");
    long WITHOUT = fnv_64_lower("WITHOUT");

    long DEFINER = fnv_64_lower("DEFINER");
    long DETERMINISTIC = fnv_64_lower("DETERMINISTIC");
    long CONTAINS = fnv_64_lower("CONTAINS");
    long SQL = fnv_64_lower("SQL");
    long CALL = fnv_64_lower("CALL");
    long CHARACTER = fnv_64_lower("CHARACTER");

    long VALIDATE = fnv_64_lower("VALIDATE");
    long NOVALIDATE = fnv_64_lower("NOVALIDATE");
    long SIMILAR = fnv_64_lower("SIMILAR");
    long CASCADE = fnv_64_lower("CASCADE");
    long RELY = fnv_64_lower("RELY");
    long NORELY = fnv_64_lower("NORELY");
    long ROW = fnv_64_lower("ROW");
    long ROWS = fnv_64_lower("ROWS");
    long RANGE = fnv_64_lower("RANGE");
    long PRECEDING = fnv_64_lower("PRECEDING");
    long FOLLOWING = fnv_64_lower("FOLLOWING");
    long UNBOUNDED = fnv_64_lower("UNBOUNDED");
    long SIBLINGS = fnv_64_lower("SIBLINGS");
    long NULLS = fnv_64_lower("NULLS");
    long FIRST = fnv_64_lower("FIRST");
    long LAST = fnv_64_lower("LAST");
    long AUTO_INCREMENT = fnv_64_lower("AUTO_INCREMENT");
    long STORAGE = fnv_64_lower("STORAGE");
    long STORED = fnv_64_lower("STORED");
    long VIRTUAL = fnv_64_lower("VIRTUAL");
    long UNSIGNED = fnv_64_lower("UNSIGNED");
    long ZEROFILL = fnv_64_lower("ZEROFILL");
    long GLOBAL = fnv_64_lower("GLOBAL");
    long SESSION = fnv_64_lower("SESSION");
    long NAMES = fnv_64_lower("NAMES");
    long PARTIAL = fnv_64_lower("PARTIAL");
    long SIMPLE = fnv_64_lower("SIMPLE");
    long RESTRICT = fnv_64_lower("RESTRICT");
    long ON = fnv_64_lower("ON");
    long ACTION = fnv_64_lower("ACTION");
    long SEPARATOR = fnv_64_lower("SEPARATOR");
    long DATA = fnv_64_lower("DATA");
    long MAX_ROWS = fnv_64_lower("MAX_ROWS");
    long MIN_ROWS = fnv_64_lower("MIN_ROWS");
    long ENGINE = fnv_64_lower("ENGINE");
    long SKIP = fnv_64_lower("SKIP");
    long RECURSIVE = fnv_64_lower("RECURSIVE");
    long ROLLUP = fnv_64_lower("ROLLUP");
    long CUBE = fnv_64_lower("CUBE");
}

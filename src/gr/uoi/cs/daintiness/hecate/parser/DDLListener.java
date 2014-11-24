// Generated from /home/giskou/dev/phd/Hecate/src/gr/uoi/cs/daintiness/hecate/parser/DDL.g4 by ANTLR 4.1
package gr.uoi.cs.daintiness.hecate.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DDLParser}.
 */
public interface DDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DDLParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statement(@NotNull DDLParser.Drop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statement(@NotNull DDLParser.Drop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull DDLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull DDLParser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#collate}.
	 * @param ctx the parse tree
	 */
	void enterCollate(@NotNull DDLParser.CollateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#collate}.
	 * @param ctx the parse tree
	 */
	void exitCollate(@NotNull DDLParser.CollateContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(@NotNull DDLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(@NotNull DDLParser.Insert_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull DDLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull DDLParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull DDLParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull DDLParser.NamespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(@NotNull DDLParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(@NotNull DDLParser.CommitContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull DDLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull DDLParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull DDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull DDLParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void enterReference_option(@NotNull DDLParser.Reference_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void exitReference_option(@NotNull DDLParser.Reference_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(@NotNull DDLParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(@NotNull DDLParser.Sql_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statement(@NotNull DDLParser.Create_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statement(@NotNull DDLParser.Create_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition(@NotNull DDLParser.Reference_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition(@NotNull DDLParser.Reference_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#consume_until_end}.
	 * @param ctx the parse tree
	 */
	void enterConsume_until_end(@NotNull DDLParser.Consume_until_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#consume_until_end}.
	 * @param ctx the parse tree
	 */
	void exitConsume_until_end(@NotNull DDLParser.Consume_until_endContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull DDLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull DDLParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#data_option}.
	 * @param ctx the parse tree
	 */
	void enterData_option(@NotNull DDLParser.Data_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#data_option}.
	 * @param ctx the parse tree
	 */
	void exitData_option(@NotNull DDLParser.Data_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#parNameList}.
	 * @param ctx the parse tree
	 */
	void enterParNameList(@NotNull DDLParser.ParNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#parNameList}.
	 * @param ctx the parse tree
	 */
	void exitParNameList(@NotNull DDLParser.ParNameListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(@NotNull DDLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(@NotNull DDLParser.Update_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull DDLParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull DDLParser.ValueListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#special_char}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_char(@NotNull DDLParser.Special_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#special_char}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_char(@NotNull DDLParser.Special_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull DDLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull DDLParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(@NotNull DDLParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(@NotNull DDLParser.EnumContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull DDLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull DDLParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#pl_sql}.
	 * @param ctx the parse tree
	 */
	void enterPl_sql(@NotNull DDLParser.Pl_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#pl_sql}.
	 * @param ctx the parse tree
	 */
	void exitPl_sql(@NotNull DDLParser.Pl_sqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(@NotNull DDLParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(@NotNull DDLParser.SizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#quoted_rest}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_rest(@NotNull DDLParser.Quoted_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#quoted_rest}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_rest(@NotNull DDLParser.Quoted_restContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#alter_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_constraint(@NotNull DDLParser.Alter_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#alter_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_constraint(@NotNull DDLParser.Alter_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull DDLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull DDLParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#refs}.
	 * @param ctx the parse tree
	 */
	void enterRefs(@NotNull DDLParser.RefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#refs}.
	 * @param ctx the parse tree
	 */
	void exitRefs(@NotNull DDLParser.RefsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull DDLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull DDLParser.ColumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#set_type}.
	 * @param ctx the parse tree
	 */
	void enterSet_type(@NotNull DDLParser.Set_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#set_type}.
	 * @param ctx the parse tree
	 */
	void exitSet_type(@NotNull DDLParser.Set_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(@NotNull DDLParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(@NotNull DDLParser.ViewContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(@NotNull DDLParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(@NotNull DDLParser.NameListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#foreign}.
	 * @param ctx the parse tree
	 */
	void enterForeign(@NotNull DDLParser.ForeignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#foreign}.
	 * @param ctx the parse tree
	 */
	void exitForeign(@NotNull DDLParser.ForeignContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#generic}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(@NotNull DDLParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#generic}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(@NotNull DDLParser.GenericContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull DDLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull DDLParser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#unique}.
	 * @param ctx the parse tree
	 */
	void enterUnique(@NotNull DDLParser.UniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#unique}.
	 * @param ctx the parse tree
	 */
	void exitUnique(@NotNull DDLParser.UniqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull DDLParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull DDLParser.SetContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void enterCharset_name(@NotNull DDLParser.Charset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void exitCharset_name(@NotNull DDLParser.Charset_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull DDLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull DDLParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(@NotNull DDLParser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(@NotNull DDLParser.Table_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull DDLParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull DDLParser.IdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(@NotNull DDLParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(@NotNull DDLParser.OrderContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(@NotNull DDLParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(@NotNull DDLParser.QuoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull DDLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull DDLParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#triger_name}.
	 * @param ctx the parse tree
	 */
	void enterTriger_name(@NotNull DDLParser.Triger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#triger_name}.
	 * @param ctx the parse tree
	 */
	void exitTriger_name(@NotNull DDLParser.Triger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#valuesList}.
	 * @param ctx the parse tree
	 */
	void enterValuesList(@NotNull DDLParser.ValuesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#valuesList}.
	 * @param ctx the parse tree
	 */
	void exitValuesList(@NotNull DDLParser.ValuesListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#other_statement}.
	 * @param ctx the parse tree
	 */
	void enterOther_statement(@NotNull DDLParser.Other_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#other_statement}.
	 * @param ctx the parse tree
	 */
	void exitOther_statement(@NotNull DDLParser.Other_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#index_key}.
	 * @param ctx the parse tree
	 */
	void enterIndex_key(@NotNull DDLParser.Index_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#index_key}.
	 * @param ctx the parse tree
	 */
	void exitIndex_key(@NotNull DDLParser.Index_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#fulltext}.
	 * @param ctx the parse tree
	 */
	void enterFulltext(@NotNull DDLParser.FulltextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#fulltext}.
	 * @param ctx the parse tree
	 */
	void exitFulltext(@NotNull DDLParser.FulltextContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#parValueList}.
	 * @param ctx the parse tree
	 */
	void enterParValueList(@NotNull DDLParser.ParValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#parValueList}.
	 * @param ctx the parse tree
	 */
	void exitParValueList(@NotNull DDLParser.ParValueListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#col_name}.
	 * @param ctx the parse tree
	 */
	void enterCol_name(@NotNull DDLParser.Col_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#col_name}.
	 * @param ctx the parse tree
	 */
	void exitCol_name(@NotNull DDLParser.Col_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(@NotNull DDLParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(@NotNull DDLParser.Index_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#consume_par}.
	 * @param ctx the parse tree
	 */
	void enterConsume_par(@NotNull DDLParser.Consume_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#consume_par}.
	 * @param ctx the parse tree
	 */
	void exitConsume_par(@NotNull DDLParser.Consume_parContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(@NotNull DDLParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(@NotNull DDLParser.CheckContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statement(@NotNull DDLParser.Alter_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statement(@NotNull DDLParser.Alter_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#line_constraint}.
	 * @param ctx the parse tree
	 */
	void enterLine_constraint(@NotNull DDLParser.Line_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#line_constraint}.
	 * @param ctx the parse tree
	 */
	void exitLine_constraint(@NotNull DDLParser.Line_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#restricted}.
	 * @param ctx the parse tree
	 */
	void enterRestricted(@NotNull DDLParser.RestrictedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#restricted}.
	 * @param ctx the parse tree
	 */
	void exitRestricted(@NotNull DDLParser.RestrictedContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(@NotNull DDLParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(@NotNull DDLParser.DatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull DDLParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull DDLParser.ReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#triger}.
	 * @param ctx the parse tree
	 */
	void enterTriger(@NotNull DDLParser.TrigerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#triger}.
	 * @param ctx the parse tree
	 */
	void exitTriger(@NotNull DDLParser.TrigerContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDdl_statement(@NotNull DDLParser.Ddl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDdl_statement(@NotNull DDLParser.Ddl_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#constr_name}.
	 * @param ctx the parse tree
	 */
	void enterConstr_name(@NotNull DDLParser.Constr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#constr_name}.
	 * @param ctx the parse tree
	 */
	void exitConstr_name(@NotNull DDLParser.Constr_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull DDLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull DDLParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#table_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_option(@NotNull DDLParser.Table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#table_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_option(@NotNull DDLParser.Table_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#column_option}.
	 * @param ctx the parse tree
	 */
	void enterColumn_option(@NotNull DDLParser.Column_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#column_option}.
	 * @param ctx the parse tree
	 */
	void exitColumn_option(@NotNull DDLParser.Column_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull DDLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull DDLParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#char_set}.
	 * @param ctx the parse tree
	 */
	void enterChar_set(@NotNull DDLParser.Char_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#char_set}.
	 * @param ctx the parse tree
	 */
	void exitChar_set(@NotNull DDLParser.Char_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link DDLParser#index_type}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type(@NotNull DDLParser.Index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#index_type}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type(@NotNull DDLParser.Index_typeContext ctx);
}
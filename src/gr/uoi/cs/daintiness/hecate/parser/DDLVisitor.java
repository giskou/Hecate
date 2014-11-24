// Generated from /home/giskou/dev/phd/Hecate/src/gr/uoi/cs/daintiness/hecate/parser/DDL.g4 by ANTLR 4.1
package gr.uoi.cs.daintiness.hecate.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DDLParser#drop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statement(@NotNull DDLParser.Drop_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(@NotNull DDLParser.Schema_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(@NotNull DDLParser.CollateContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(@NotNull DDLParser.Insert_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull DDLParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(@NotNull DDLParser.NamespaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(@NotNull DDLParser.CommitContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull DDLParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull DDLParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#reference_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_option(@NotNull DDLParser.Reference_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(@NotNull DDLParser.Sql_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#create_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statement(@NotNull DDLParser.Create_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#reference_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_definition(@NotNull DDLParser.Reference_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#consume_until_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsume_until_end(@NotNull DDLParser.Consume_until_endContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull DDLParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#data_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_option(@NotNull DDLParser.Data_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#parNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParNameList(@NotNull DDLParser.ParNameListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(@NotNull DDLParser.Update_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(@NotNull DDLParser.ValueListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#special_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_char(@NotNull DDLParser.Special_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull DDLParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(@NotNull DDLParser.EnumContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(@NotNull DDLParser.TableContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#pl_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_sql(@NotNull DDLParser.Pl_sqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(@NotNull DDLParser.SizeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#quoted_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_rest(@NotNull DDLParser.Quoted_restContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#alter_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_constraint(@NotNull DDLParser.Alter_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull DDLParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#refs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefs(@NotNull DDLParser.RefsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(@NotNull DDLParser.ColumnContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#set_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_type(@NotNull DDLParser.Set_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView(@NotNull DDLParser.ViewContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(@NotNull DDLParser.NameListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#foreign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign(@NotNull DDLParser.ForeignContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(@NotNull DDLParser.GenericContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull DDLParser.Table_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique(@NotNull DDLParser.UniqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull DDLParser.SetContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#charset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset_name(@NotNull DDLParser.Charset_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull DDLParser.Index_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_definition(@NotNull DDLParser.Table_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull DDLParser.IdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(@NotNull DDLParser.OrderContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(@NotNull DDLParser.QuoteContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull DDLParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#triger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriger_name(@NotNull DDLParser.Triger_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#valuesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList(@NotNull DDLParser.ValuesListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#other_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_statement(@NotNull DDLParser.Other_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#index_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_key(@NotNull DDLParser.Index_keyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#fulltext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulltext(@NotNull DDLParser.FulltextContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#parValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParValueList(@NotNull DDLParser.ParValueListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#col_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_name(@NotNull DDLParser.Col_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(@NotNull DDLParser.Index_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#consume_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsume_par(@NotNull DDLParser.Consume_parContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(@NotNull DDLParser.CheckContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#alter_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_statement(@NotNull DDLParser.Alter_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#line_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_constraint(@NotNull DDLParser.Line_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#restricted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricted(@NotNull DDLParser.RestrictedContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(@NotNull DDLParser.DatabaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(@NotNull DDLParser.ReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#triger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriger(@NotNull DDLParser.TrigerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#ddl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_statement(@NotNull DDLParser.Ddl_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#constr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_name(@NotNull DDLParser.Constr_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull DDLParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#table_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_option(@NotNull DDLParser.Table_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#column_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_option(@NotNull DDLParser.Column_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(@NotNull DDLParser.Collation_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#char_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_set(@NotNull DDLParser.Char_setContext ctx);

	/**
	 * Visit a parse tree produced by {@link DDLParser#index_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_type(@NotNull DDLParser.Index_typeContext ctx);
}
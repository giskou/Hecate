// Generated from /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/daintiness/hecate/parser/DDL.g4 by ANTLR 4.0
package gr.uoi.cs.daintiness.hecate.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DDLListener extends ParseTreeListener {
	void enterDrop_statement(DDLParser.Drop_statementContext ctx);
	void exitDrop_statement(DDLParser.Drop_statementContext ctx);

	void enterSchema_name(DDLParser.Schema_nameContext ctx);
	void exitSchema_name(DDLParser.Schema_nameContext ctx);

	void enterCollate(DDLParser.CollateContext ctx);
	void exitCollate(DDLParser.CollateContext ctx);

	void enterInsert_statement(DDLParser.Insert_statementContext ctx);
	void exitInsert_statement(DDLParser.Insert_statementContext ctx);

	void enterFunction(DDLParser.FunctionContext ctx);
	void exitFunction(DDLParser.FunctionContext ctx);

	void enterNamespace(DDLParser.NamespaceContext ctx);
	void exitNamespace(DDLParser.NamespaceContext ctx);

	void enterCommit(DDLParser.CommitContext ctx);
	void exitCommit(DDLParser.CommitContext ctx);

	void enterPrimary(DDLParser.PrimaryContext ctx);
	void exitPrimary(DDLParser.PrimaryContext ctx);

	void enterValue(DDLParser.ValueContext ctx);
	void exitValue(DDLParser.ValueContext ctx);

	void enterReference_option(DDLParser.Reference_optionContext ctx);
	void exitReference_option(DDLParser.Reference_optionContext ctx);

	void enterSql_statement(DDLParser.Sql_statementContext ctx);
	void exitSql_statement(DDLParser.Sql_statementContext ctx);

	void enterCreate_statement(DDLParser.Create_statementContext ctx);
	void exitCreate_statement(DDLParser.Create_statementContext ctx);

	void enterReference_definition(DDLParser.Reference_definitionContext ctx);
	void exitReference_definition(DDLParser.Reference_definitionContext ctx);

	void enterConsume_until_end(DDLParser.Consume_until_endContext ctx);
	void exitConsume_until_end(DDLParser.Consume_until_endContext ctx);

	void enterIndex(DDLParser.IndexContext ctx);
	void exitIndex(DDLParser.IndexContext ctx);

	void enterData_option(DDLParser.Data_optionContext ctx);
	void exitData_option(DDLParser.Data_optionContext ctx);

	void enterParNameList(DDLParser.ParNameListContext ctx);
	void exitParNameList(DDLParser.ParNameListContext ctx);

	void enterUpdate_statement(DDLParser.Update_statementContext ctx);
	void exitUpdate_statement(DDLParser.Update_statementContext ctx);

	void enterValueList(DDLParser.ValueListContext ctx);
	void exitValueList(DDLParser.ValueListContext ctx);

	void enterSpecial_char(DDLParser.Special_charContext ctx);
	void exitSpecial_char(DDLParser.Special_charContext ctx);

	void enterNumber(DDLParser.NumberContext ctx);
	void exitNumber(DDLParser.NumberContext ctx);

	void enterEnum(DDLParser.EnumContext ctx);
	void exitEnum(DDLParser.EnumContext ctx);

	void enterTable(DDLParser.TableContext ctx);
	void exitTable(DDLParser.TableContext ctx);

	void enterPl_sql(DDLParser.Pl_sqlContext ctx);
	void exitPl_sql(DDLParser.Pl_sqlContext ctx);

	void enterSize(DDLParser.SizeContext ctx);
	void exitSize(DDLParser.SizeContext ctx);

	void enterQuoted_rest(DDLParser.Quoted_restContext ctx);
	void exitQuoted_rest(DDLParser.Quoted_restContext ctx);

	void enterAlter_constraint(DDLParser.Alter_constraintContext ctx);
	void exitAlter_constraint(DDLParser.Alter_constraintContext ctx);

	void enterStart(DDLParser.StartContext ctx);
	void exitStart(DDLParser.StartContext ctx);

	void enterRefs(DDLParser.RefsContext ctx);
	void exitRefs(DDLParser.RefsContext ctx);

	void enterColumn(DDLParser.ColumnContext ctx);
	void exitColumn(DDLParser.ColumnContext ctx);

	void enterView(DDLParser.ViewContext ctx);
	void exitView(DDLParser.ViewContext ctx);

	void enterNameList(DDLParser.NameListContext ctx);
	void exitNameList(DDLParser.NameListContext ctx);

	void enterForeign(DDLParser.ForeignContext ctx);
	void exitForeign(DDLParser.ForeignContext ctx);

	void enterGeneric(DDLParser.GenericContext ctx);
	void exitGeneric(DDLParser.GenericContext ctx);

	void enterTable_constraint(DDLParser.Table_constraintContext ctx);
	void exitTable_constraint(DDLParser.Table_constraintContext ctx);

	void enterUnique(DDLParser.UniqueContext ctx);
	void exitUnique(DDLParser.UniqueContext ctx);

	void enterSet(DDLParser.SetContext ctx);
	void exitSet(DDLParser.SetContext ctx);

	void enterCharset_name(DDLParser.Charset_nameContext ctx);
	void exitCharset_name(DDLParser.Charset_nameContext ctx);

	void enterIndex_name(DDLParser.Index_nameContext ctx);
	void exitIndex_name(DDLParser.Index_nameContext ctx);

	void enterTable_definition(DDLParser.Table_definitionContext ctx);
	void exitTable_definition(DDLParser.Table_definitionContext ctx);

	void enterIdent(DDLParser.IdentContext ctx);
	void exitIdent(DDLParser.IdentContext ctx);

	void enterOrder(DDLParser.OrderContext ctx);
	void exitOrder(DDLParser.OrderContext ctx);

	void enterQuote(DDLParser.QuoteContext ctx);
	void exitQuote(DDLParser.QuoteContext ctx);

	void enterTable_name(DDLParser.Table_nameContext ctx);
	void exitTable_name(DDLParser.Table_nameContext ctx);

	void enterTriger_name(DDLParser.Triger_nameContext ctx);
	void exitTriger_name(DDLParser.Triger_nameContext ctx);

	void enterValuesList(DDLParser.ValuesListContext ctx);
	void exitValuesList(DDLParser.ValuesListContext ctx);

	void enterOther_statement(DDLParser.Other_statementContext ctx);
	void exitOther_statement(DDLParser.Other_statementContext ctx);

	void enterIndex_key(DDLParser.Index_keyContext ctx);
	void exitIndex_key(DDLParser.Index_keyContext ctx);

	void enterFulltext(DDLParser.FulltextContext ctx);
	void exitFulltext(DDLParser.FulltextContext ctx);

	void enterParValueList(DDLParser.ParValueListContext ctx);
	void exitParValueList(DDLParser.ParValueListContext ctx);

	void enterCol_name(DDLParser.Col_nameContext ctx);
	void exitCol_name(DDLParser.Col_nameContext ctx);

	void enterIndex_option(DDLParser.Index_optionContext ctx);
	void exitIndex_option(DDLParser.Index_optionContext ctx);

	void enterConsume_par(DDLParser.Consume_parContext ctx);
	void exitConsume_par(DDLParser.Consume_parContext ctx);

	void enterCheck(DDLParser.CheckContext ctx);
	void exitCheck(DDLParser.CheckContext ctx);

	void enterAlter_statement(DDLParser.Alter_statementContext ctx);
	void exitAlter_statement(DDLParser.Alter_statementContext ctx);

	void enterLine_constraint(DDLParser.Line_constraintContext ctx);
	void exitLine_constraint(DDLParser.Line_constraintContext ctx);

	void enterRestricted(DDLParser.RestrictedContext ctx);
	void exitRestricted(DDLParser.RestrictedContext ctx);

	void enterDatabase(DDLParser.DatabaseContext ctx);
	void exitDatabase(DDLParser.DatabaseContext ctx);

	void enterReference(DDLParser.ReferenceContext ctx);
	void exitReference(DDLParser.ReferenceContext ctx);

	void enterTriger(DDLParser.TrigerContext ctx);
	void exitTriger(DDLParser.TrigerContext ctx);

	void enterDdl_statement(DDLParser.Ddl_statementContext ctx);
	void exitDdl_statement(DDLParser.Ddl_statementContext ctx);

	void enterConstr_name(DDLParser.Constr_nameContext ctx);
	void exitConstr_name(DDLParser.Constr_nameContext ctx);

	void enterString(DDLParser.StringContext ctx);
	void exitString(DDLParser.StringContext ctx);

	void enterTable_option(DDLParser.Table_optionContext ctx);
	void exitTable_option(DDLParser.Table_optionContext ctx);

	void enterColumn_option(DDLParser.Column_optionContext ctx);
	void exitColumn_option(DDLParser.Column_optionContext ctx);

	void enterCollation_name(DDLParser.Collation_nameContext ctx);
	void exitCollation_name(DDLParser.Collation_nameContext ctx);

	void enterChar_set(DDLParser.Char_setContext ctx);
	void exitChar_set(DDLParser.Char_setContext ctx);

	void enterIndex_type(DDLParser.Index_typeContext ctx);
	void exitIndex_type(DDLParser.Index_typeContext ctx);
}
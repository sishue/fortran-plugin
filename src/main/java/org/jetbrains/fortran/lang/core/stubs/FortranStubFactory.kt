package org.jetbrains.fortran.lang.core.stubs

import org.jetbrains.fortran.lang.psi.impl.*

fun fortranStubFactory(name: String): FortranStubElementType<*, *> = when (name) {
        // program units
        "MAIN_PROGRAM" -> FortranProgramUnitStub.Type("MAIN PROGRAM", ::FortranMainProgramImpl)
        "FUNCTION_SUBPROGRAM" -> FortranProgramUnitStub.Type("FUNCTION_SUBPROGRAM", ::FortranFunctionSubprogramImpl)
        "SUBROUTINE_SUBPROGRAM" -> FortranProgramUnitStub.Type("SUBROUTINE_SUBPROGRAM", ::FortranSubroutineSubprogramImpl)
        "MODULE" -> FortranProgramUnitStub.Type("MODULE", ::FortranModuleImpl)
        "SUBMODULE" -> FortranProgramUnitStub.Type("SUBMODULE", ::FortranSubmoduleImpl)
        "BLOCK_DATA" -> FortranProgramUnitStub.Type("BLOCK_DATA", ::FortranBlockDataImpl)
        "SEPARATE_MODULE_SUBPROGRAM" -> FortranProgramUnitStub.Type("SEPARATE_MODULE_SUBPROGRAM", ::FortranSeparateModuleSubprogramImpl)
        "PROGRAM_UNIT" -> FortranProgramUnitStub.Type("UNKNOWN_PROGRAM_UNIT", ::FortranProgramUnitImpl)

        "BLOCK" -> FortranBlockStub.Type
        // declaration constructs
        "DERIVED_TYPE_DEF" -> FortranDeclarationConstructStub.Type("DERIVED_TYPE_DEF", ::FortranDerivedTypeDefImpl)
        "ENUM_DEF" -> FortranDeclarationConstructStub.Type("ENUM_DEF", ::FortranEnumDefImpl)
        "INTERFACE_BLOCK" -> FortranDeclarationConstructStub.Type("INTERFACE_BLOCK", ::FortranInterfaceBlockImpl)
        "DECLARATION_CONSTRUCT" -> FortranDeclarationConstructStub.Type("DECLARATION_CONSTRUCT", ::FortranDeclarationConstructImpl)

        // executable constructs
        "ASSOCIATE_CONSTRUCT" -> FortranExecutableConstructStub.Type("ASSOCIATE_CONSTRUCT", ::FortranAssociateConstructImpl)
        "BLOCK_CONSTRUCT" -> FortranExecutableConstructStub.Type("BLOCK_CONSTRUCT", ::FortranBlockConstructImpl)
        "CASE_CONSTRUCT" -> FortranExecutableConstructStub.Type("CASE_CONSTRUCT", ::FortranCaseConstructImpl)
        "CRITICAL_CONSTRUCT" -> FortranExecutableConstructStub.Type("CRITICAL_CONSTRUCT", ::FortranCriticalConstructImpl)
        "NONLABEL_DO_CONSTRUCT" -> FortranExecutableConstructStub.Type("NONLABEL_DO_CONSTRUCT", ::FortranNonlabelDoConstructImpl)
        "LABELED_DO_CONSTRUCT" -> FortranExecutableConstructStub.Type("LABELED_DO_CONSTRUCT", ::FortranLabeledDoConstructImpl)
        "FORALL_CONSTRUCT" -> FortranExecutableConstructStub.Type("FORALL_CONSTRUCT", ::FortranForallConstructImpl)
        "IF_CONSTRUCT" -> FortranExecutableConstructStub.Type("IF_CONSTRUCT", ::FortranIfConstructImpl)
        "SELECT_TYPE_CONSTRUCT" -> FortranExecutableConstructStub.Type("SELECT_TYPE_CONSTRUCT", ::FortranSelectTypeConstructImpl)
        "WHERE_CONSTRUCT" -> FortranExecutableConstructStub.Type("WHERE_CONSTRUCT", ::FortranWhereConstructImpl)
        "EXECUTABLE_CONSTRUCT" -> FortranExecutableConstructStub.Type("EXECUTABLE_CONSTRUCT", ::FortranExecutableConstructImpl)

        // stmts
        "DERIVED_TYPE_STMT" -> FortranStatementStub.Type("DERIVED_TYPE_STMT", ::FortranDerivedTypeStmtImpl)
        "END_TYPE_STMT" -> FortranStatementStub.Type("END_TYPE_STMT", ::FortranEndTypeStmtImpl)
        "TYPE_PARAM_DEF_STMT" -> FortranStatementStub.Type("TYPE_PARAM_DEF_STMT", ::FortranTypeParamDefStmtImpl)
        "COMPONENT_DEF_STMT" -> FortranStatementStub.Type("COMPONENT_DEF_STMT", ::FortranComponentDefStmtImpl)
        "DATA_COMPONENT_DEF_STMT" -> FortranStatementStub.Type("DATA_COMPONENT_DEF_STMT", ::FortranDataComponentDefStmtImpl)
        "PROC_COMPONENT_DEF_STMT" -> FortranStatementStub.Type("PROC_COMPONENT_DEF_STMT", ::FortranProcComponentDefStmtImpl)
        "PRIVATE_STMT" -> FortranStatementStub.Type("PRIVATE_STMT", ::FortranPrivateStmtImpl)
        "TYPE_BOUND_PROCEDURE_STMT" -> FortranStatementStub.Type("TYPE_BOUND_PROCEDURE_STMT", ::FortranTypeBoundProcedureStmtImpl)
        "TYPE_BOUND_GENERIC_STMT" -> FortranStatementStub.Type("TYPE_BOUND_GENERIC_STMT", ::FortranTypeBoundGenericStmtImpl)
        "FINAL_PROCEDURE_STMT" -> FortranStatementStub.Type("FINAL_PROCEDURE_STMT", ::FortranFinalProcedureStmtImpl)
        "ENUM_DEF_STMT" -> FortranStatementStub.Type("ENUM_DEF_STMT", ::FortranEnumDefStmtImpl)
        "ENUMERATOR_DEF_STMT" -> FortranStatementStub.Type("ENUMERATOR_DEF_STMT", ::FortranEnumeratorDefStmtImpl)
        "END_ENUM_STMT" -> FortranStatementStub.Type("END_ENUM_STMT", ::FortranEndEnumStmtImpl)
        "TYPE_DECLARATION_STMT" -> FortranStatementStub.Type("TYPE_DECLARATION_STMT", ::FortranTypeDeclarationStmtImpl)
        "ACCESS_STMT" -> FortranStatementStub.Type("ACCESS_STMT", ::FortranAccessStmtImpl)
        "ALLOCATABLE_STMT" -> FortranStatementStub.Type("ALLOCATABLE_STMT", ::FortranAllocatableStmtImpl)
        "ASYNCHRONOUS_STMT" -> FortranStatementStub.Type("ASYNCHRONOUS_STMT", ::FortranAsynchronousStmtImpl)
        "BIND_STMT" -> FortranStatementStub.Type("BIND_STMT", ::FortranBindStmtImpl)
        "CODIMENSION_STMT" -> FortranStatementStub.Type("CODIMENSION_STMT", ::FortranCodimensionStmtImpl)
        "CONTIGUOUS_STMT" -> FortranStatementStub.Type("CONTIGUOUS_STMT", ::FortranContiguousStmtImpl)
        "DATA_STMT" -> FortranStatementStub.Type("DATA_STMT", ::FortranDataStmtImpl)
        "DIMENSION_STMT" -> FortranStatementStub.Type("DIMENSION_STMT", ::FortranDimensionStmtImpl)
        "INTENT_STMT" -> FortranStatementStub.Type("INTENT_STMT", ::FortranIntentStmtImpl)
        "OPTIONAL_STMT" -> FortranStatementStub.Type("OPTIONAL_STMT", ::FortranOptionalStmtImpl)
        "PARAMETER_STMT" -> FortranStatementStub.Type("PARAMETER_STMT", ::FortranParameterStmtImpl)
        "POINTER_STMT" -> FortranStatementStub.Type("POINTER_STMT", ::FortranPointerStmtImpl)
        "PROTECTED_STMT" -> FortranStatementStub.Type("PROTECTED_STMT", ::FortranProtectedStmtImpl)
        "SAVE_STMT" -> FortranStatementStub.Type("SAVE_STMT", ::FortranSaveStmtImpl)
        "TARGET_STMT" -> FortranStatementStub.Type("TARGET_STMT", ::FortranTargetStmtImpl)
        "VALUE_STMT" -> FortranStatementStub.Type("VALUE_STMT", ::FortranValueStmtImpl)
        "VOLATILE_STMT" -> FortranStatementStub.Type("VOLATILE_STMT", ::FortranVolatileStmtImpl)
        "IMPLICIT_STMT" -> FortranStatementStub.Type("IMPLICIT_STMT", ::FortranImplicitStmtImpl)
        "NAMELIST_STMT" -> FortranStatementStub.Type("NAMELIST_STMT", ::FortranNamelistStmtImpl)
        "EQUIVALENCE_STMT" -> FortranStatementStub.Type("EQUIVALENCE_STMT", ::FortranEquivalenceStmtImpl)
        "COMMON_STMT" -> FortranStatementStub.Type("COMMON_STMT", ::FortranCommonStmtImpl)
        "ALLOCATE_STMT" -> FortranStatementStub.Type("ALLOCATE_STMT", ::FortranAllocateStmtImpl)
        "NULLIFY_STMT" -> FortranStatementStub.Type("NULLIFY_STMT", ::FortranNullifyStmtImpl)
        "DEALLOCATE_STMT" -> FortranStatementStub.Type("DEALLOCATE_STMT", ::FortranDeallocateStmtImpl)
        "ASSIGNMENT_STMT" -> FortranStatementStub.Type("ASSIGNMENT_STMT", ::FortranAssignmentStmtImpl)
        "POINTER_ASSIGNMENT_STMT" -> FortranStatementStub.Type("POINTER_ASSIGNMENT_STMT", ::FortranPointerAssignmentStmtImpl)
        "WHERE_STMT" -> FortranStatementStub.Type("WHERE_STMT", ::FortranWhereStmtImpl)
        "WHERE_CONSTRUCT_STMT" -> FortranStatementStub.Type("WHERE_CONSTRUCT_STMT", ::FortranWhereConstructStmtImpl)
        "MASKED_ELSEWHERE_STMT" -> FortranStatementStub.Type("MASKED_ELSEWHERE_STMT", ::FortranMaskedElsewhereStmtImpl)
        "ELSEWHERE_STMT" -> FortranStatementStub.Type("ELSEWHERE_STMT", ::FortranElsewhereStmtImpl)
        "END_WHERE_STMT" -> FortranStatementStub.Type("END_WHERE_STMT", ::FortranEndWhereStmtImpl)
        "FORALL_CONSTRUCT_STMT" -> FortranStatementStub.Type("FORALL_CONSTRUCT_STMT", ::FortranForallConstructStmtImpl)
        "END_FORALL_STMT" -> FortranStatementStub.Type("END_FORALL_STMT", ::FortranEndForallStmtImpl)
        "FORALL_STMT" -> FortranStatementStub.Type("FORALL_STMT", ::FortranForallStmtImpl)
        "ASSOCIATE_STMT" -> FortranStatementStub.Type("ASSOCIATE_STMT", ::FortranAssociateStmtImpl)
        "END_ASSOCIATE_STMT" -> FortranStatementStub.Type("END_ASSOCIATE_STMT", ::FortranEndAssociateStmtImpl)
        "BLOCK_STMT" -> FortranStatementStub.Type("BLOCK_STMT", ::FortranBlockStmtImpl)
        "END_BLOCK_STMT" -> FortranStatementStub.Type("END_BLOCK_STMT", ::FortranEndBlockStmtImpl)
        "CRITICAL_STMT" -> FortranStatementStub.Type("CRITICAL_STMT", ::FortranCriticalStmtImpl)
        "END_CRITICAL_STMT" -> FortranStatementStub.Type("END_CRITICAL_STMT", ::FortranEndCriticalStmtImpl)
        "NONLABEL_DO_STMT" -> FortranStatementStub.Type("NONLABEL_DO_STMT", ::FortranNonlabelDoStmtImpl)
        "LABEL_DO_STMT" -> FortranStatementStub.Type("LABEL_DO_STMT", ::FortranLabelDoStmtImpl)
        "END_DO_STMT" -> FortranStatementStub.Type("END_DO_STMT", ::FortranEndDoStmtImpl)
        "CYCLE_STMT" -> FortranStatementStub.Type("CYCLE_STMT", ::FortranCycleStmtImpl)
        "IF_THEN_STMT" -> FortranStatementStub.Type("IF_THEN_STMT", ::FortranIfThenStmtImpl)
        "ELSE_IF_STMT" -> FortranStatementStub.Type("ELSE_IF_STMT", ::FortranElseIfStmtImpl)
        "ELSE_STMT" -> FortranStatementStub.Type("ELSE_STMT", ::FortranElseStmtImpl)
        "END_IF_STMT" -> FortranStatementStub.Type("END_IF_STMT", ::FortranEndIfStmtImpl)
        "IF_STMT" -> FortranStatementStub.Type("IF_STMT", ::FortranIfStmtImpl)
        "SELECT_CASE_STMT" -> FortranStatementStub.Type("SELECT_CASE_STMT", ::FortranSelectCaseStmtImpl)
        "CASE_STMT" -> FortranStatementStub.Type("CASE_STMT", ::FortranCaseStmtImpl)
        "END_SELECT_STMT" -> FortranStatementStub.Type("END_SELECT_STMT", ::FortranEndSelectStmtImpl)
        "SELECT_TYPE_STMT" -> FortranStatementStub.Type("SELECT_TYPE_STMT", ::FortranSelectTypeStmtImpl)
        "TYPE_GUARD_STMT" -> FortranStatementStub.Type("TYPE_GUARD_STMT", ::FortranTypeGuardStmtImpl)
        "EXIT_STMT" -> FortranStatementStub.Type("EXIT_STMT", ::FortranExitStmtImpl)
        "GOTO_STMT" -> FortranStatementStub.Type("GOTO_STMT", ::FortranGotoStmtImpl)
        "COMPUTED_GOTO_STMT" -> FortranStatementStub.Type("COMPUTED_GOTO_STMT", ::FortranComputedGotoStmtImpl)
        "ARITHMETIC_IF_STMT" -> FortranStatementStub.Type("ARITHMETIC_IF_STMT", ::FortranArithmeticIfStmtImpl)
        "CONTINUE_STMT" -> FortranStatementStub.Type("CONTINUE_STMT", ::FortranContinueStmtImpl)
        "STOP_STMT" -> FortranStatementStub.Type("STOP_STMT", ::FortranStopStmtImpl)
        "ERROR_STOP_STMT" -> FortranStatementStub.Type("ERROR_STOP_STMT", ::FortranErrorStopStmtImpl)
        "SYNC_ALL_STMT" -> FortranStatementStub.Type("SYNC_ALL_STMT", ::FortranSyncAllStmtImpl)
        "SYNC_IMAGES_STMT" -> FortranStatementStub.Type("SYNC_IMAGES_STMT", ::FortranSyncImagesStmtImpl)
        "SYNC_MEMORY_STMT" -> FortranStatementStub.Type("SYNC_MEMORY_STMT", ::FortranSyncMemoryStmtImpl)
        "LOCK_STMT" -> FortranStatementStub.Type("LOCK_STMT", ::FortranLockStmtImpl)
        "UNLOCK_STMT" -> FortranStatementStub.Type("UNLOCK_STMT", ::FortranUnlockStmtImpl)
        "OPEN_STMT" -> FortranStatementStub.Type("OPEN_STMT", ::FortranOpenStmtImpl)
        "CLOSE_STMT" -> FortranStatementStub.Type("CLOSE_STMT", ::FortranCloseStmtImpl)
        "READ_STMT" -> FortranStatementStub.Type("READ_STMT", ::FortranReadStmtImpl)
        "WRITE_STMT" -> FortranStatementStub.Type("WRITE_STMT", ::FortranWriteStmtImpl)
        "PRINT_STMT" -> FortranStatementStub.Type("PRINT_STMT", ::FortranPrintStmtImpl)
        "WAIT_STMT" -> FortranStatementStub.Type("WAIT_STMT", ::FortranWaitStmtImpl)
        "BACKSPACE_STMT" -> FortranStatementStub.Type("BACKSPACE_STMT", ::FortranBackspaceStmtImpl)
        "ENDFILE_STMT" -> FortranStatementStub.Type("ENDFILE_STMT", ::FortranEndfileStmtImpl)
        "REWIND_STMT" -> FortranStatementStub.Type("REWIND_STMT", ::FortranReadStmtImpl)
        "FLUSH_STMT" -> FortranStatementStub.Type("FLUSH_STMT", ::FortranFlushStmtImpl)
        "INQUIRE_STMT" -> FortranStatementStub.Type("INQUIRE_STMT", ::FortranInquireStmtImpl)
        "FORMAT_STMT" -> FortranStatementStub.Type("FORMAT_STMT", ::FortranFormatStmtImpl)
        "PROGRAM_STMT" -> FortranStatementStub.Type("PROGRAM_STMT", ::FortranProgramStmtImpl)
        "END_PROGRAM_STMT" -> FortranStatementStub.Type("END_PROGRAM_STMT", ::FortranEndProgramStmtImpl)
        "MODULE_STMT" -> FortranStatementStub.Type("MODULE_STMT", ::FortranModuleStmtImpl)
        "END_MODULE_STMT" -> FortranStatementStub.Type("END_MODULE_STMT", ::FortranEndModuleStmtImpl)
        "USE_STMT" -> FortranStatementStub.Type("USE_STMT", ::FortranUseStmtImpl)
        "RENAME_STMT" -> FortranStatementStub.Type("RENAME_STMT", ::FortranRenameStmtImpl)
        "ONLY_STMT" -> FortranStatementStub.Type("ONLY_STMT", ::FortranOnlyStmtImpl)
        "SUBMODULE_STMT" -> FortranStatementStub.Type("SUBMODULE_STMT", ::FortranSubmoduleStmtImpl)
        "END_SUBMODULE_STMT" -> FortranStatementStub.Type("END_SUBMODULE_STMT", ::FortranEndSubmoduleStmtImpl)
        "BLOCK_DATA_STMT" -> FortranStatementStub.Type("BLOCK_DATA_STMT", ::FortranBlockDataStmtImpl)
        "END_BLOCK_DATA_STMT" -> FortranStatementStub.Type("END_BLOCK_DATA_STMT", ::FortranEndBlockDataStmtImpl)
        "INTERFACE_STMT" -> FortranStatementStub.Type("INTERFACE_STMT", ::FortranInterfaceStmtImpl)
        "END_INTERFACE_STMT" -> FortranStatementStub.Type("END_INTERFACE_STMT", ::FortranEndInterfaceStmtImpl)
        "PROCEDURE_STMT" -> FortranStatementStub.Type("PROCEDURE_STMT", ::FortranProcedureStmtImpl)
        "IMPORT_STMT" -> FortranStatementStub.Type("IMPORT_STMT", ::FortranImportStmtImpl)
        "EXTERNAL_STMT" -> FortranStatementStub.Type("EXTERNAL_STMT", ::FortranExternalStmtImpl)
        "PROCEDURE_DECLARATION_STMT" -> FortranStatementStub.Type("PROCEDURE_DECLARATION_STMT", ::FortranProcedureDeclarationStmtImpl)
        "INTRINSIC_STMT" -> FortranStatementStub.Type("INTRINSIC_STMT", ::FortranIntrinsicStmtImpl)
        "CALL_STMT" -> FortranStatementStub.Type("CALL_STMT", ::FortranCallStmtImpl)
        "FUNCTION_STMT" -> FortranStatementStub.Type("FUNCTION_STMT", ::FortranFunctionStmtImpl)
        "END_FUNCTION_STMT" -> FortranStatementStub.Type("END_FUNCTION_STMT", ::FortranEndFunctionStmtImpl)
        "SUBROUTINE_STMT" -> FortranStatementStub.Type("SUBROUTINE_STMT", ::FortranSubroutineStmtImpl)
        "END_SUBROUTINE_STMT" -> FortranStatementStub.Type("END_SUBROUTINE_STMT", ::FortranEndSubroutineStmtImpl)
        "MP_SUBPROGRAM_STMT" -> FortranStatementStub.Type("MP_SUBPROGRAM_STMT", ::FortranMpSubprogramStmtImpl)
        "END_MP_SUBPROGRAM_STMT" -> FortranStatementStub.Type("END_MP_SUBPROGRAM_STMT", ::FortranEndMpSubprogramStmtImpl)
        "ENTRY_STMT" -> FortranStatementStub.Type("ENTRY_STMT", ::FortranEntryStmtImpl)
        "RETURN_STMT" -> FortranStatementStub.Type("RETURN_STMT", ::FortranRenameStmtImpl)
        "CONTAINS_STMT" -> FortranStatementStub.Type("CONTAINS_STMT", ::FortranContainsStmtImpl)
        "STMT_FUNCTION_STMT" -> FortranStatementStub.Type("STMT_FUNCTION_STMT", ::FortranStmtFunctionStmtImpl)
        "PAUSE_STMT" -> FortranStatementStub.Type("PAUSE_STMT", ::FortranPauseStmtImpl)
        "ASSIGN_STMT" -> FortranStatementStub.Type("ASSIGN_STMT", ::FortranAssignStmtImpl)
        "ASSIGNED_GOTO_STMT" -> FortranStatementStub.Type("ASSIGNED_GOTO_STMT", ::FortranAssignedGotoStmtImpl)
        "INCLUDE_STMT" -> FortranStatementStub.Type("INCLUDE_STMT", ::FortranIncludeStmtImpl)
        "ACCEPT_STMT" -> FortranStatementStub.Type("ACCEPT_STMT", ::FortranAcceptStmtImpl)
        "ENCODE_STMT" -> FortranStatementStub.Type("ENCODE_STMT", ::FortranEncodeStmtImpl)
        "DECODE_STMT" -> FortranStatementStub.Type("DECODE_STMT", ::FortranDecodeStmtImpl)
        "TYPE_STMT" -> FortranStatementStub.Type("TYPE_STMT", ::FortranTypeStmtImpl)

      else -> error("Unknown element $name")
}


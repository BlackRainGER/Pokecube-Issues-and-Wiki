/* Generated By:JJTree&JavaCC: Do not edit this line. ParserTokenManager.java */
package org.nfunk.jep;

@SuppressWarnings({ "unused" })
public class ParserTokenManager implements ParserConstants
{
    static final long[]          jjbitVec0          = { 0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL,
            0xffffffffffffffffL };
    static final long[]          jjbitVec2          = { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };
    static final long[]          jjbitVec3          = { 0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL,
            0x600000000000000L };
    static final long[]          jjbitVec4          = { 0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL };
    static final long[]          jjbitVec5          = { 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL,
            0xffffffffffffffffL };
    static final long[]          jjbitVec6          = { 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L };
    static final long[]          jjbitVec7          = { 0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L };
    static final long[]          jjbitVec8          = { 0x3fffffffffffL, 0x0L, 0x0L, 0x0L };
    static final int[]           jjnextStates       = { 14, 15, 17, 25, 26, 27, 32, 33, 13, 18, 6, 7, 9, 21, 23, 3, 4,
            30, 31, 34, 35, };
    public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, "\75", "\73", "\54", "\76", "\74", "\75\75", "\74\75", "\76\75",
            "\41\75", "\46\46", "\174\174", "\53", "\55", "\52", "\56", "\57", "\45", "\41", "\136", "\136\136", "\133",
            "\135", "\50", "\51", };
    public static final String[] lexStateNames      = { "NO_DOT_IN_IDENTIFIERS", "DEFAULT", };
    public static final int[]    jjnewLexState      = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, };
    static final long[]          jjtoToken          = { 0x3fffffc9a81L, };
    static final long[]          jjtoSkip           = { 0x7eL, };

    private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
    {
        switch (hiByte)
        {
        case 0:
            return (ParserTokenManager.jjbitVec2[i2] & l2) != 0L;
        default:
            if ((ParserTokenManager.jjbitVec0[i1] & l1) != 0L) return true;
            return false;
        }
    }

    private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
    {
        switch (hiByte)
        {
        case 0:
            return (ParserTokenManager.jjbitVec4[i2] & l2) != 0L;
        case 48:
            return (ParserTokenManager.jjbitVec5[i2] & l2) != 0L;
        case 49:
            return (ParserTokenManager.jjbitVec6[i2] & l2) != 0L;
        case 51:
            return (ParserTokenManager.jjbitVec7[i2] & l2) != 0L;
        case 61:
            return (ParserTokenManager.jjbitVec8[i2] & l2) != 0L;
        default:
            if ((ParserTokenManager.jjbitVec3[i1] & l1) != 0L) return true;
            return false;
        }
    }

    public java.io.PrintStream debugStream     = System.out;
    protected JavaCharStream   input_stream;
    private final int[]        jjrounds        = new int[36];
    private final int[]        jjstateSet      = new int[72];
    protected char             curChar;
    int                        curLexState     = 1;
    int                        defaultLexState = 1;
    int                        jjnewStateCnt;
    int                        jjround;
    int                        jjmatchedPos;
    int                        jjmatchedKind;

    public ParserTokenManager(JavaCharStream stream)
    {
        if (JavaCharStream.staticFlag) throw new Error(
                "ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        this.input_stream = stream;
    }

    public ParserTokenManager(JavaCharStream stream, int lexState)
    {
        this(stream);
        this.SwitchTo(lexState);
    }

    public Token getNextToken()
    {
        Token matchedToken;
        int curPos = 0;

        EOFLoop:
        for (;;)
        {
            try
            {
                this.curChar = this.input_stream.BeginToken();
            }
            catch (final java.io.IOException e)
            {
                this.jjmatchedKind = 0;
                matchedToken = this.jjFillToken();
                return matchedToken;
            }

            switch (this.curLexState)
            {
            case 0:
                try
                {
                    this.input_stream.backup(0);
                    while (this.curChar <= 32 && (0x100002600L & 1L << this.curChar) != 0L)
                        this.curChar = this.input_stream.BeginToken();
                }
                catch (final java.io.IOException e1)
                {
                    continue EOFLoop;
                }
                this.jjmatchedKind = 0x7fffffff;
                this.jjmatchedPos = 0;
                curPos = this.jjMoveStringLiteralDfa0_0();
                break;
            case 1:
                try
                {
                    this.input_stream.backup(0);
                    while (this.curChar <= 32 && (0x100002600L & 1L << this.curChar) != 0L)
                        this.curChar = this.input_stream.BeginToken();
                }
                catch (final java.io.IOException e1)
                {
                    continue EOFLoop;
                }
                this.jjmatchedKind = 0x7fffffff;
                this.jjmatchedPos = 0;
                curPos = this.jjMoveStringLiteralDfa0_1();
                break;
            }
            if (this.jjmatchedKind != 0x7fffffff)
            {
                if (this.jjmatchedPos + 1 < curPos) this.input_stream.backup(curPos - this.jjmatchedPos - 1);
                if ((ParserTokenManager.jjtoToken[this.jjmatchedKind >> 6] & 1L << (this.jjmatchedKind & 077)) != 0L)
                {
                    matchedToken = this.jjFillToken();
                    if (ParserTokenManager.jjnewLexState[this.jjmatchedKind] != -1)
                        this.curLexState = ParserTokenManager.jjnewLexState[this.jjmatchedKind];
                    return matchedToken;
                }
                else
                {
                    if (ParserTokenManager.jjnewLexState[this.jjmatchedKind] != -1)
                        this.curLexState = ParserTokenManager.jjnewLexState[this.jjmatchedKind];
                    continue EOFLoop;
                }
            }
            int error_line = this.input_stream.getEndLine();
            int error_column = this.input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try
            {
                this.input_stream.readChar();
                this.input_stream.backup(1);
            }
            catch (final java.io.IOException e1)
            {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : this.input_stream.GetImage();
                if (this.curChar == '\n' || this.curChar == '\r')
                {
                    error_line++;
                    error_column = 0;
                }
                else error_column++;
            }
            if (!EOFSeen)
            {
                this.input_stream.backup(1);
                error_after = curPos <= 1 ? "" : this.input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, this.curLexState, error_line, error_column, error_after, this.curChar,
                    TokenMgrError.LEXICAL_ERROR);
        }
    }

    private final void jjAddStates(int start, int end)
    {
        do
            this.jjstateSet[this.jjnewStateCnt++] = ParserTokenManager.jjnextStates[start];
        while (start++ != end);
    }

    private final void jjCheckNAdd(int state)
    {
        if (this.jjrounds[state] != this.jjround)
        {
            this.jjstateSet[this.jjnewStateCnt++] = state;
            this.jjrounds[state] = this.jjround;
        }
    }

    private final void jjCheckNAddStates(int start, int end)
    {
        do
            this.jjCheckNAdd(ParserTokenManager.jjnextStates[start]);
        while (start++ != end);
    }

    private final void jjCheckNAddTwoStates(int state1, int state2)
    {
        this.jjCheckNAdd(state1);
        this.jjCheckNAdd(state2);
    }

    protected Token jjFillToken()
    {
        final Token t = Token.newToken(this.jjmatchedKind);
        t.kind = this.jjmatchedKind;
        final String im = ParserTokenManager.jjstrLiteralImages[this.jjmatchedKind];
        t.image = im == null ? this.input_stream.GetImage() : im;
        t.beginLine = this.input_stream.getBeginLine();
        t.beginColumn = this.input_stream.getBeginColumn();
        t.endLine = this.input_stream.getEndLine();
        t.endColumn = this.input_stream.getEndColumn();
        return t;
    }

    private final int jjMoveNfa_0(int startState, int curPos)
    {
        int startsAt = 0;
        this.jjnewStateCnt = 36;
        int i = 1;
        this.jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;)
        {
            if (++this.jjround == 0x7fffffff) this.ReInitRounds();
            if (this.curChar < 64)
            {
                final long l = 1L << this.curChar;
                MatchLoop:
                do
                    switch (this.jjstateSet[--i])
                    {
                    case 13:
                        if (this.curChar == 42) this.jjCheckNAddTwoStates(19, 20);
                        else if (this.curChar == 47) this.jjCheckNAddStates(0, 2);
                        break;
                    case 0:
                        if ((0x3ff000000000000L & l) != 0L)
                        {
                            if (kind > 7) kind = 7;
                            this.jjCheckNAddStates(3, 7);
                        }
                        else if (this.curChar == 47) this.jjAddStates(8, 9);
                        else if (this.curChar == 36)
                        {
                            if (kind > 15) kind = 15;
                            this.jjCheckNAdd(11);
                        }
                        else if (this.curChar == 34) this.jjCheckNAddStates(10, 12);
                        else if (this.curChar == 46) this.jjCheckNAdd(1);
                        break;
                    case 1:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAddTwoStates(1, 2);
                        break;
                    case 3:
                        if ((0x280000000000L & l) != 0L) this.jjCheckNAdd(4);
                        break;
                    case 4:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAdd(4);
                        break;
                    case 5:
                        if (this.curChar == 34) this.jjCheckNAddStates(10, 12);
                        break;
                    case 6:
                        if ((0xfffffffbffffdbffL & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 8:
                        if ((0x8400000000L & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 9:
                        if (this.curChar == 34 && kind > 11) kind = 11;
                        break;
                    case 10:
                        if (this.curChar != 36) break;
                        if (kind > 15) kind = 15;
                        this.jjCheckNAdd(11);
                        break;
                    case 11:
                        if ((0x3ff001000000000L & l) == 0L) break;
                        if (kind > 15) kind = 15;
                        this.jjCheckNAdd(11);
                        break;
                    case 12:
                        if (this.curChar == 47) this.jjAddStates(8, 9);
                        break;
                    case 14:
                        if ((0xffffffffffffdbffL & l) != 0L) this.jjCheckNAddStates(0, 2);
                        break;
                    case 15:
                        if ((0x2400L & l) != 0L && kind > 5) kind = 5;
                        break;
                    case 16:
                        if (this.curChar == 10 && kind > 5) kind = 5;
                        break;
                    case 17:
                        if (this.curChar == 13) this.jjstateSet[this.jjnewStateCnt++] = 16;
                        break;
                    case 18:
                        if (this.curChar == 42) this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 19:
                        if ((0xfffffbffffffffffL & l) != 0L) this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 20:
                        if (this.curChar == 42) this.jjAddStates(13, 14);
                        break;
                    case 21:
                        if ((0xffff7fffffffffffL & l) != 0L) this.jjCheckNAddTwoStates(22, 20);
                        break;
                    case 22:
                        if ((0xfffffbffffffffffL & l) != 0L) this.jjCheckNAddTwoStates(22, 20);
                        break;
                    case 23:
                        if (this.curChar == 47 && kind > 6) kind = 6;
                        break;
                    case 24:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 7) kind = 7;
                        this.jjCheckNAddStates(3, 7);
                        break;
                    case 25:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 7) kind = 7;
                        this.jjCheckNAdd(25);
                        break;
                    case 26:
                        if ((0x3ff000000000000L & l) != 0L) this.jjCheckNAddTwoStates(26, 27);
                        break;
                    case 27:
                        if (this.curChar != 46) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAddTwoStates(28, 29);
                        break;
                    case 28:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAddTwoStates(28, 29);
                        break;
                    case 30:
                        if ((0x280000000000L & l) != 0L) this.jjCheckNAdd(31);
                        break;
                    case 31:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAdd(31);
                        break;
                    case 32:
                        if ((0x3ff000000000000L & l) != 0L) this.jjCheckNAddTwoStates(32, 33);
                        break;
                    case 34:
                        if ((0x280000000000L & l) != 0L) this.jjCheckNAdd(35);
                        break;
                    case 35:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAdd(35);
                        break;
                    default:
                        break;
                    }
                while (i != startsAt);
            }
            else if (this.curChar < 128)
            {
                final long l = 1L << (this.curChar & 077);
                MatchLoop:
                do
                    switch (this.jjstateSet[--i])
                    {
                    case 0:
                    case 11:
                        if ((0x7fffffe87fffffeL & l) == 0L) break;
                        if (kind > 15) kind = 15;
                        this.jjCheckNAdd(11);
                        break;
                    case 2:
                        if ((0x2000000020L & l) != 0L) this.jjAddStates(15, 16);
                        break;
                    case 6:
                        if ((0xffffffffefffffffL & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 7:
                        if (this.curChar == 92) this.jjstateSet[this.jjnewStateCnt++] = 8;
                        break;
                    case 8:
                        if ((0x14404410000000L & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 14:
                        this.jjAddStates(0, 2);
                        break;
                    case 19:
                        this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 21:
                    case 22:
                        this.jjCheckNAddTwoStates(22, 20);
                        break;
                    case 29:
                        if ((0x2000000020L & l) != 0L) this.jjAddStates(17, 18);
                        break;
                    case 33:
                        if ((0x2000000020L & l) != 0L) this.jjAddStates(19, 20);
                        break;
                    default:
                        break;
                    }
                while (i != startsAt);
            }
            else
            {
                final int hiByte = this.curChar >> 8;
                final int i1 = hiByte >> 6;
                final long l1 = 1L << (hiByte & 077);
                final int i2 = (this.curChar & 0xff) >> 6;
                final long l2 = 1L << (this.curChar & 077);
                MatchLoop:
                do
                    switch (this.jjstateSet[--i])
                    {
                    case 0:
                    case 11:
                        if (!ParserTokenManager.jjCanMove_1(hiByte, i1, i2, l1, l2)) break;
                        if (kind > 15) kind = 15;
                        this.jjCheckNAdd(11);
                        break;
                    case 6:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjAddStates(10, 12);
                        break;
                    case 14:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjAddStates(0, 2);
                        break;
                    case 19:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 21:
                    case 22:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjCheckNAddTwoStates(22, 20);
                        break;
                    default:
                        break;
                    }
                while (i != startsAt);
            }
            if (kind != 0x7fffffff)
            {
                this.jjmatchedKind = kind;
                this.jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = this.jjnewStateCnt) == (startsAt = 36 - (this.jjnewStateCnt = startsAt))) return curPos;
            try
            {
                this.curChar = this.input_stream.readChar();
            }
            catch (final java.io.IOException e)
            {
                return curPos;
            }
        }
    }

    private final int jjMoveNfa_1(int startState, int curPos)
    {
        int startsAt = 0;
        this.jjnewStateCnt = 36;
        int i = 1;
        this.jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;)
        {
            if (++this.jjround == 0x7fffffff) this.ReInitRounds();
            if (this.curChar < 64)
            {
                final long l = 1L << this.curChar;
                MatchLoop:
                do
                    switch (this.jjstateSet[--i])
                    {
                    case 13:
                        if (this.curChar == 42) this.jjCheckNAddTwoStates(19, 20);
                        else if (this.curChar == 47) this.jjCheckNAddStates(0, 2);
                        break;
                    case 0:
                        if ((0x3ff000000000000L & l) != 0L)
                        {
                            if (kind > 7) kind = 7;
                            this.jjCheckNAddStates(3, 7);
                        }
                        else if (this.curChar == 47) this.jjAddStates(8, 9);
                        else if (this.curChar == 36)
                        {
                            if (kind > 12) kind = 12;
                            this.jjCheckNAdd(11);
                        }
                        else if (this.curChar == 34) this.jjCheckNAddStates(10, 12);
                        else if (this.curChar == 46) this.jjCheckNAdd(1);
                        break;
                    case 1:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAddTwoStates(1, 2);
                        break;
                    case 3:
                        if ((0x280000000000L & l) != 0L) this.jjCheckNAdd(4);
                        break;
                    case 4:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAdd(4);
                        break;
                    case 5:
                        if (this.curChar == 34) this.jjCheckNAddStates(10, 12);
                        break;
                    case 6:
                        if ((0xfffffffbffffdbffL & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 8:
                        if ((0x8400000000L & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 9:
                        if (this.curChar == 34 && kind > 11) kind = 11;
                        break;
                    case 10:
                        if (this.curChar != 36) break;
                        if (kind > 12) kind = 12;
                        this.jjCheckNAdd(11);
                        break;
                    case 11:
                        if ((0x3ff401000000000L & l) == 0L) break;
                        if (kind > 12) kind = 12;
                        this.jjCheckNAdd(11);
                        break;
                    case 12:
                        if (this.curChar == 47) this.jjAddStates(8, 9);
                        break;
                    case 14:
                        if ((0xffffffffffffdbffL & l) != 0L) this.jjCheckNAddStates(0, 2);
                        break;
                    case 15:
                        if ((0x2400L & l) != 0L && kind > 5) kind = 5;
                        break;
                    case 16:
                        if (this.curChar == 10 && kind > 5) kind = 5;
                        break;
                    case 17:
                        if (this.curChar == 13) this.jjstateSet[this.jjnewStateCnt++] = 16;
                        break;
                    case 18:
                        if (this.curChar == 42) this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 19:
                        if ((0xfffffbffffffffffL & l) != 0L) this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 20:
                        if (this.curChar == 42) this.jjAddStates(13, 14);
                        break;
                    case 21:
                        if ((0xffff7fffffffffffL & l) != 0L) this.jjCheckNAddTwoStates(22, 20);
                        break;
                    case 22:
                        if ((0xfffffbffffffffffL & l) != 0L) this.jjCheckNAddTwoStates(22, 20);
                        break;
                    case 23:
                        if (this.curChar == 47 && kind > 6) kind = 6;
                        break;
                    case 24:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 7) kind = 7;
                        this.jjCheckNAddStates(3, 7);
                        break;
                    case 25:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 7) kind = 7;
                        this.jjCheckNAdd(25);
                        break;
                    case 26:
                        if ((0x3ff000000000000L & l) != 0L) this.jjCheckNAddTwoStates(26, 27);
                        break;
                    case 27:
                        if (this.curChar != 46) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAddTwoStates(28, 29);
                        break;
                    case 28:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAddTwoStates(28, 29);
                        break;
                    case 30:
                        if ((0x280000000000L & l) != 0L) this.jjCheckNAdd(31);
                        break;
                    case 31:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAdd(31);
                        break;
                    case 32:
                        if ((0x3ff000000000000L & l) != 0L) this.jjCheckNAddTwoStates(32, 33);
                        break;
                    case 34:
                        if ((0x280000000000L & l) != 0L) this.jjCheckNAdd(35);
                        break;
                    case 35:
                        if ((0x3ff000000000000L & l) == 0L) break;
                        if (kind > 9) kind = 9;
                        this.jjCheckNAdd(35);
                        break;
                    default:
                        break;
                    }
                while (i != startsAt);
            }
            else if (this.curChar < 128)
            {
                final long l = 1L << (this.curChar & 077);
                MatchLoop:
                do
                    switch (this.jjstateSet[--i])
                    {
                    case 0:
                    case 11:
                        if ((0x7fffffe87fffffeL & l) == 0L) break;
                        if (kind > 12) kind = 12;
                        this.jjCheckNAdd(11);
                        break;
                    case 2:
                        if ((0x2000000020L & l) != 0L) this.jjAddStates(15, 16);
                        break;
                    case 6:
                        if ((0xffffffffefffffffL & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 7:
                        if (this.curChar == 92) this.jjstateSet[this.jjnewStateCnt++] = 8;
                        break;
                    case 8:
                        if ((0x14404410000000L & l) != 0L) this.jjCheckNAddStates(10, 12);
                        break;
                    case 14:
                        this.jjAddStates(0, 2);
                        break;
                    case 19:
                        this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 21:
                    case 22:
                        this.jjCheckNAddTwoStates(22, 20);
                        break;
                    case 29:
                        if ((0x2000000020L & l) != 0L) this.jjAddStates(17, 18);
                        break;
                    case 33:
                        if ((0x2000000020L & l) != 0L) this.jjAddStates(19, 20);
                        break;
                    default:
                        break;
                    }
                while (i != startsAt);
            }
            else
            {
                final int hiByte = this.curChar >> 8;
                final int i1 = hiByte >> 6;
                final long l1 = 1L << (hiByte & 077);
                final int i2 = (this.curChar & 0xff) >> 6;
                final long l2 = 1L << (this.curChar & 077);
                MatchLoop:
                do
                    switch (this.jjstateSet[--i])
                    {
                    case 0:
                    case 11:
                        if (!ParserTokenManager.jjCanMove_1(hiByte, i1, i2, l1, l2)) break;
                        if (kind > 12) kind = 12;
                        this.jjCheckNAdd(11);
                        break;
                    case 6:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjAddStates(10, 12);
                        break;
                    case 14:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjAddStates(0, 2);
                        break;
                    case 19:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjCheckNAddTwoStates(19, 20);
                        break;
                    case 21:
                    case 22:
                        if (ParserTokenManager.jjCanMove_0(hiByte, i1, i2, l1, l2)) this.jjCheckNAddTwoStates(22, 20);
                        break;
                    default:
                        break;
                    }
                while (i != startsAt);
            }
            if (kind != 0x7fffffff)
            {
                this.jjmatchedKind = kind;
                this.jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = this.jjnewStateCnt) == (startsAt = 36 - (this.jjnewStateCnt = startsAt))) return curPos;
            try
            {
                this.curChar = this.input_stream.readChar();
            }
            catch (final java.io.IOException e)
            {
                return curPos;
            }
        }
    }

    private final int jjMoveStringLiteralDfa0_0()
    {
        switch (this.curChar)
        {
        case 33:
            this.jjmatchedKind = 35;
            return this.jjMoveStringLiteralDfa1_0(0x4000000L);
        case 37:
            return this.jjStopAtPos(0, 34);
        case 38:
            return this.jjMoveStringLiteralDfa1_0(0x8000000L);
        case 40:
            return this.jjStopAtPos(0, 40);
        case 41:
            return this.jjStopAtPos(0, 41);
        case 42:
            return this.jjStopAtPos(0, 31);
        case 43:
            return this.jjStopAtPos(0, 29);
        case 44:
            return this.jjStopAtPos(0, 20);
        case 45:
            return this.jjStopAtPos(0, 30);
        case 46:
            return this.jjStartNfaWithStates_0(0, 32, 1);
        case 47:
            return this.jjStartNfaWithStates_0(0, 33, 13);
        case 59:
            return this.jjStopAtPos(0, 19);
        case 60:
            this.jjmatchedKind = 22;
            return this.jjMoveStringLiteralDfa1_0(0x1000000L);
        case 61:
            this.jjmatchedKind = 18;
            return this.jjMoveStringLiteralDfa1_0(0x800000L);
        case 62:
            this.jjmatchedKind = 21;
            return this.jjMoveStringLiteralDfa1_0(0x2000000L);
        case 91:
            return this.jjStopAtPos(0, 38);
        case 93:
            return this.jjStopAtPos(0, 39);
        case 94:
            this.jjmatchedKind = 36;
            return this.jjMoveStringLiteralDfa1_0(0x2000000000L);
        case 124:
            return this.jjMoveStringLiteralDfa1_0(0x10000000L);
        default:
            return this.jjMoveNfa_0(0, 0);
        }
    }

    private final int jjMoveStringLiteralDfa0_1()
    {
        switch (this.curChar)
        {
        case 33:
            this.jjmatchedKind = 35;
            return this.jjMoveStringLiteralDfa1_1(0x4000000L);
        case 37:
            return this.jjStopAtPos(0, 34);
        case 38:
            return this.jjMoveStringLiteralDfa1_1(0x8000000L);
        case 40:
            return this.jjStopAtPos(0, 40);
        case 41:
            return this.jjStopAtPos(0, 41);
        case 42:
            return this.jjStopAtPos(0, 31);
        case 43:
            return this.jjStopAtPos(0, 29);
        case 44:
            return this.jjStopAtPos(0, 20);
        case 45:
            return this.jjStopAtPos(0, 30);
        case 46:
            return this.jjStartNfaWithStates_1(0, 32, 1);
        case 47:
            return this.jjStartNfaWithStates_1(0, 33, 13);
        case 59:
            return this.jjStopAtPos(0, 19);
        case 60:
            this.jjmatchedKind = 22;
            return this.jjMoveStringLiteralDfa1_1(0x1000000L);
        case 61:
            this.jjmatchedKind = 18;
            return this.jjMoveStringLiteralDfa1_1(0x800000L);
        case 62:
            this.jjmatchedKind = 21;
            return this.jjMoveStringLiteralDfa1_1(0x2000000L);
        case 91:
            return this.jjStopAtPos(0, 38);
        case 93:
            return this.jjStopAtPos(0, 39);
        case 94:
            this.jjmatchedKind = 36;
            return this.jjMoveStringLiteralDfa1_1(0x2000000000L);
        case 124:
            return this.jjMoveStringLiteralDfa1_1(0x10000000L);
        default:
            return this.jjMoveNfa_1(0, 0);
        }
    }

    private final int jjMoveStringLiteralDfa1_0(long active0)
    {
        try
        {
            this.curChar = this.input_stream.readChar();
        }
        catch (final java.io.IOException e)
        {
            this.jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (this.curChar)
        {
        case 38:
            if ((active0 & 0x8000000L) != 0L) return this.jjStopAtPos(1, 27);
            break;
        case 61:
            if ((active0 & 0x800000L) != 0L) return this.jjStopAtPos(1, 23);
            else if ((active0 & 0x1000000L) != 0L) return this.jjStopAtPos(1, 24);
            else if ((active0 & 0x2000000L) != 0L) return this.jjStopAtPos(1, 25);
            else if ((active0 & 0x4000000L) != 0L) return this.jjStopAtPos(1, 26);
            break;
        case 94:
            if ((active0 & 0x2000000000L) != 0L) return this.jjStopAtPos(1, 37);
            break;
        case 124:
            if ((active0 & 0x10000000L) != 0L) return this.jjStopAtPos(1, 28);
            break;
        default:
            break;
        }
        return this.jjStartNfa_0(0, active0);
    }

    private final int jjMoveStringLiteralDfa1_1(long active0)
    {
        try
        {
            this.curChar = this.input_stream.readChar();
        }
        catch (final java.io.IOException e)
        {
            this.jjStopStringLiteralDfa_1(0, active0);
            return 1;
        }
        switch (this.curChar)
        {
        case 38:
            if ((active0 & 0x8000000L) != 0L) return this.jjStopAtPos(1, 27);
            break;
        case 61:
            if ((active0 & 0x800000L) != 0L) return this.jjStopAtPos(1, 23);
            else if ((active0 & 0x1000000L) != 0L) return this.jjStopAtPos(1, 24);
            else if ((active0 & 0x2000000L) != 0L) return this.jjStopAtPos(1, 25);
            else if ((active0 & 0x4000000L) != 0L) return this.jjStopAtPos(1, 26);
            break;
        case 94:
            if ((active0 & 0x2000000000L) != 0L) return this.jjStopAtPos(1, 37);
            break;
        case 124:
            if ((active0 & 0x10000000L) != 0L) return this.jjStopAtPos(1, 28);
            break;
        default:
            break;
        }
        return this.jjStartNfa_1(0, active0);
    }

    private final int jjStartNfa_0(int pos, long active0)
    {
        return this.jjMoveNfa_0(this.jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }

    private final int jjStartNfa_1(int pos, long active0)
    {
        return this.jjMoveNfa_1(this.jjStopStringLiteralDfa_1(pos, active0), pos + 1);
    }

    private final int jjStartNfaWithStates_0(int pos, int kind, int state)
    {
        this.jjmatchedKind = kind;
        this.jjmatchedPos = pos;
        try
        {
            this.curChar = this.input_stream.readChar();
        }
        catch (final java.io.IOException e)
        {
            return pos + 1;
        }
        return this.jjMoveNfa_0(state, pos + 1);
    }

    private final int jjStartNfaWithStates_1(int pos, int kind, int state)
    {
        this.jjmatchedKind = kind;
        this.jjmatchedPos = pos;
        try
        {
            this.curChar = this.input_stream.readChar();
        }
        catch (final java.io.IOException e)
        {
            return pos + 1;
        }
        return this.jjMoveNfa_1(state, pos + 1);
    }

    private final int jjStopAtPos(int pos, int kind)
    {
        this.jjmatchedKind = kind;
        this.jjmatchedPos = pos;
        return pos + 1;
    }

    private final int jjStopStringLiteralDfa_0(int pos, long active0)
    {
        switch (pos)
        {
        case 0:
            if ((active0 & 0x100000000L) != 0L) return 1;
            if ((active0 & 0x200000000L) != 0L) return 13;
            return -1;
        default:
            return -1;
        }
    }

    private final int jjStopStringLiteralDfa_1(int pos, long active0)
    {
        switch (pos)
        {
        case 0:
            if ((active0 & 0x100000000L) != 0L) return 1;
            if ((active0 & 0x200000000L) != 0L) return 13;
            return -1;
        default:
            return -1;
        }
    }

    public void ReInit(JavaCharStream stream)
    {
        this.jjmatchedPos = this.jjnewStateCnt = 0;
        this.curLexState = this.defaultLexState;
        this.input_stream = stream;
        this.ReInitRounds();
    }

    public void ReInit(JavaCharStream stream, int lexState)
    {
        this.ReInit(stream);
        this.SwitchTo(lexState);
    }

    private final void ReInitRounds()
    {
        int i;
        this.jjround = 0x80000001;
        for (i = 36; i-- > 0;)
            this.jjrounds[i] = 0x80000000;
    }

    public void setDebugStream(java.io.PrintStream ds)
    {
        this.debugStream = ds;
    }

    public void SwitchTo(int lexState)
    {
        if (lexState >= 2 || lexState < 0) throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState
                + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        else this.curLexState = lexState;
    }

}

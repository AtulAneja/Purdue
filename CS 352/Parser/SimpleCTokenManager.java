/* SimpleCTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. SimpleCTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class SimpleCTokenManager implements SimpleCConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000000080L) != 0L)
            return 0;
         if ((active0 & 0x4800000000L) != 0L)
         {
            jjmatchedKind = 53;
            return -1;
         }
         if ((active0 & 0x7fff000L) != 0L)
         {
            jjmatchedKind = 48;
            return 36;
         }
         return -1;
      case 1:
         if ((active0 & 0x4b0000L) != 0L)
            return 36;
         if ((active0 & 0x7b4f000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 1;
            }
            return 36;
         }
         if ((active0 & 0x4800000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 53;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x800000L) != 0L)
            return 36;
         if ((active0 & 0x737f000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
            return 36;
         }
         return -1;
      case 3:
         if ((active0 & 0x14c000L) != 0L)
            return 36;
         if ((active0 & 0x7233000L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 3;
            }
            return 36;
         }
         return -1;
      case 4:
         if ((active0 & 0x5030000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 4;
            }
            return 36;
         }
         if ((active0 & 0x2200000L) != 0L)
            return 36;
         return -1;
      case 5:
         if ((active0 & 0x4030000L) != 0L)
            return 36;
         if ((active0 & 0x1000000L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 5;
            }
            return 36;
         }
         return -1;
      case 6:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 6;
            return 36;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 32:
         return jjStopAtPos(0, 1);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 37:
         return jjStopAtPos(0, 47);
      case 38:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 40:
         return jjStopAtPos(0, 10);
      case 41:
         return jjStopAtPos(0, 11);
      case 42:
         return jjStopAtPos(0, 45);
      case 43:
         return jjStopAtPos(0, 43);
      case 44:
         return jjStopAtPos(0, 31);
      case 45:
         return jjStopAtPos(0, 44);
      case 47:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 59:
         return jjStopAtPos(0, 32);
      case 60:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 61:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 62:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 91:
         return jjStopAtPos(0, 27);
      case 93:
         return jjStopAtPos(0, 28);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1003000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x430000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0xc000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 123:
         return jjStopAtPos(0, 29);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 125:
         return jjStopAtPos(0, 30);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 42:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 36);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x203000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 111:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x187c000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 124:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x240000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x100c000L);
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 36);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x30000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x30000L);
      case 100:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 36);
         break;
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 36);
         break;
      case 103:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x3000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(4, 14);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 36);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 107:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 36);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x30000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(5, 12);
         break;
      case 101:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 110:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 36);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(6, 16);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 24, 36);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 46;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0xffffff7b00000000L & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(0, 3); }
                  else if (curChar == 39)
                     { jjAddStates(4, 5); }
                  if ((0xfc00ff7b00000000L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     { jjCheckNAddStates(6, 13); }
                  }
                  if ((0xff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                  }
                  else if (curChar == 46)
                     { jjCheckNAdd(28); }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 47)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 10)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 39)
                     { jjAddStates(4, 5); }
                  break;
               case 5:
                  if ((0xffffff7b00000000L & l) != 0L)
                     { jjCheckNAdd(6); }
                  break;
               case 6:
                  if (curChar == 39 && kind > 49)
                     kind = 49;
                  break;
               case 8:
                  if (curChar == 48)
                     { jjCheckNAdd(6); }
                  break;
               case 9:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAdd(6); }
                  break;
               case 12:
                  if (curChar == 34)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 13:
                  if ((0xffffff7b00000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 14:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
               case 20:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAdd(16); }
                  break;
               case 16:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 17:
                  if (curChar == 34 && kind > 50)
                     kind = 50;
                  break;
               case 19:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 26:
                  if (curChar == 48)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 27:
                  if (curChar == 46)
                     { jjCheckNAdd(28); }
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAddTwoStates(28, 29); }
                  break;
               case 30:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(31); }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAdd(31); }
                  break;
               case 32:
                  if ((0xffffff7b00000000L & l) != 0L && kind > 53)
                     kind = 53;
                  break;
               case 33:
                  if ((0xff000000000000L & l) != 0L && kind > 56)
                     kind = 56;
                  break;
               case 34:
                  if ((0xfc00ff7b00000000L & l) != 0L && kind > 58)
                     kind = 58;
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAddStates(6, 13); }
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(38); }
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(39, 40); }
                  break;
               case 41:
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAdd(42); }
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAddStates(14, 17); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffffefffffffL & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     { jjCheckNAdd(36); }
                  }
                  else if ((0x78000001e8000001L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                  }
                  break;
               case 1:
                  { jjAddStates(18, 19); }
                  break;
               case 5:
                  if ((0x7fffffffefffffffL & l) != 0L)
                     { jjCheckNAdd(6); }
                  break;
               case 7:
                  if (curChar == 92)
                     { jjAddStates(20, 21); }
                  break;
               case 8:
                  if ((0x4400000000000L & l) != 0L)
                     { jjCheckNAdd(6); }
                  break;
               case 13:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 18:
                  if (curChar == 92)
                     { jjAddStates(22, 24); }
                  break;
               case 21:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 23:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 25:
                  if ((0x7e0000007eL & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 26:
                  if ((0x14400000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 29:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(25, 26); }
                  break;
               case 32:
                  if ((0x7fffffffefffffffL & l) != 0L && kind > 53)
                     kind = 53;
                  break;
               case 34:
                  if ((0x78000001e8000001L & l) != 0L && kind > 58)
                     kind = 58;
                  break;
               case 35:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  { jjCheckNAdd(36); }
                  break;
               case 36:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  { jjCheckNAdd(36); }
                  break;
               case 40:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 42:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 44:
                  if ((0x7e0000007eL & l) != 0L && kind > 54)
                     kind = 54;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(18, 19); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 46 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   13, 14, 17, 18, 5, 7, 38, 39, 40, 27, 28, 29, 44, 45, 27, 28, 
   29, 45, 1, 2, 8, 9, 19, 21, 26, 30, 31, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, "\50", "\51", 
"\143\150\141\162\52\52", "\143\150\141\162\52", "\154\157\156\147\52", "\154\157\156\147", 
"\144\157\165\142\154\145\52", "\144\157\165\142\154\145", "\166\157\151\144", "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", "\144\157", "\146\157\162", 
"\143\157\156\164\151\156\165\145", "\142\162\145\141\153", "\162\145\164\165\162\156", "\133", "\135", "\173", 
"\175", "\54", "\73", "\75", "\46", "\174\174", "\46\46", "\75\75", "\41\75", "\74", 
"\76", "\74\75", "\76\75", "\53", "\55", "\52", "\57", "\45", null, null, null, null, 
null, null, null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 13 && (0x3600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 9)
       {
          jjmatchedKind = 9;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public SimpleCTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public SimpleCTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 46; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffffc01L, 
};
static final long[] jjtoSkip = {
   0x3feL, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[46];
    static private final int[] jjstateSet = new int[2 * 46];

    
    static protected char curChar;
}

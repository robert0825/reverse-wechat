package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdw
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> uPL;
  public LinkedList<String> uPM;
  public LinkedList<Integer> uPN;
  public LinkedList<Integer> uPO;
  
  public bdw()
  {
    GMTrace.i(3865873219584L, 28803);
    this.uPL = new LinkedList();
    this.uPM = new LinkedList();
    this.uPN = new LinkedList();
    this.uPO = new LinkedList();
    GMTrace.o(3865873219584L, 28803);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3866007437312L, 28804);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.uPL);
      paramVarArgs.d(2, 1, this.uPM);
      paramVarArgs.d(3, 2, this.uPN);
      paramVarArgs.d(4, 2, this.uPO);
      GMTrace.o(3866007437312L, 28804);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.uPL);
      int i = b.a.a.a.c(2, 1, this.uPM);
      int j = b.a.a.a.c(3, 2, this.uPN);
      int k = b.a.a.a.c(4, 2, this.uPO);
      GMTrace.o(3866007437312L, 28804);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uPL.clear();
      this.uPM.clear();
      this.uPN.clear();
      this.uPO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3866007437312L, 28804);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bdw localbdw = (bdw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3866007437312L, 28804);
        return -1;
      case 1: 
        localbdw.uPL.add(locala.yqV.readString());
        GMTrace.o(3866007437312L, 28804);
        return 0;
      case 2: 
        localbdw.uPM.add(locala.yqV.readString());
        GMTrace.o(3866007437312L, 28804);
        return 0;
      case 3: 
        localbdw.uPN.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(3866007437312L, 28804);
        return 0;
      }
      localbdw.uPO.add(Integer.valueOf(locala.yqV.nj()));
      GMTrace.o(3866007437312L, 28804);
      return 0;
    }
    GMTrace.o(3866007437312L, 28804);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
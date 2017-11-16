package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ag
  extends com.tencent.mm.bm.a
{
  public LinkedList<Integer> vAA;
  public LinkedList<Integer> vAB;
  public LinkedList<Integer> vAC;
  public LinkedList<Long> vAD;
  public LinkedList<Long> vAE;
  public LinkedList<Long> vAF;
  public int vAz;
  
  public ag()
  {
    GMTrace.i(13324464947200L, 99275);
    this.vAA = new LinkedList();
    this.vAB = new LinkedList();
    this.vAC = new LinkedList();
    this.vAD = new LinkedList();
    this.vAE = new LinkedList();
    this.vAF = new LinkedList();
    GMTrace.o(13324464947200L, 99275);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13324599164928L, 99276);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.vAz);
      paramVarArgs.d(2, 2, this.vAA);
      paramVarArgs.d(3, 2, this.vAB);
      paramVarArgs.d(4, 2, this.vAC);
      paramVarArgs.d(5, 3, this.vAD);
      paramVarArgs.d(6, 3, this.vAE);
      paramVarArgs.d(7, 3, this.vAF);
      GMTrace.o(13324599164928L, 99276);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.vAz);
      int i = b.a.a.a.c(2, 2, this.vAA);
      int j = b.a.a.a.c(3, 2, this.vAB);
      int k = b.a.a.a.c(4, 2, this.vAC);
      int m = b.a.a.a.c(5, 3, this.vAD);
      int n = b.a.a.a.c(6, 3, this.vAE);
      int i1 = b.a.a.a.c(7, 3, this.vAF);
      GMTrace.o(13324599164928L, 99276);
      return paramInt + 0 + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vAA.clear();
      this.vAB.clear();
      this.vAC.clear();
      this.vAD.clear();
      this.vAE.clear();
      this.vAF.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13324599164928L, 99276);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ag localag = (ag)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13324599164928L, 99276);
        return -1;
      case 1: 
        localag.vAz = locala.yqV.nj();
        GMTrace.o(13324599164928L, 99276);
        return 0;
      case 2: 
        localag.vAA.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(13324599164928L, 99276);
        return 0;
      case 3: 
        localag.vAB.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(13324599164928L, 99276);
        return 0;
      case 4: 
        localag.vAC.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(13324599164928L, 99276);
        return 0;
      case 5: 
        localag.vAD.add(Long.valueOf(locala.yqV.nk()));
        GMTrace.o(13324599164928L, 99276);
        return 0;
      case 6: 
        localag.vAE.add(Long.valueOf(locala.yqV.nk()));
        GMTrace.o(13324599164928L, 99276);
        return 0;
      }
      localag.vAF.add(Long.valueOf(locala.yqV.nk()));
      GMTrace.o(13324599164928L, 99276);
      return 0;
    }
    GMTrace.o(13324599164928L, 99276);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
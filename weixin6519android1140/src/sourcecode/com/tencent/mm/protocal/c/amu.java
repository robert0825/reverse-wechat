package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amu
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int tPM;
  public String uBH;
  
  public amu()
  {
    GMTrace.i(3844935254016L, 28647);
    GMTrace.o(3844935254016L, 28647);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3845069471744L, 28648);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uBH != null) {
        paramVarArgs.e(1, this.uBH);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      paramVarArgs.fk(3, this.tPM);
      GMTrace.o(3845069471744L, 28648);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uBH == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.uBH) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eBt);
      }
      paramInt = b.a.a.a.fh(3, this.tPM);
      GMTrace.o(3845069471744L, 28648);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3845069471744L, 28648);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amu localamu = (amu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3845069471744L, 28648);
          return -1;
        case 1: 
          localamu.uBH = locala.yqV.readString();
          GMTrace.o(3845069471744L, 28648);
          return 0;
        case 2: 
          localamu.eBt = locala.yqV.readString();
          GMTrace.o(3845069471744L, 28648);
          return 0;
        }
        localamu.tPM = locala.yqV.nj();
        GMTrace.o(3845069471744L, 28648);
        return 0;
      }
      GMTrace.o(3845069471744L, 28648);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\amu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
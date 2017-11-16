package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dm
  extends com.tencent.mm.bm.a
{
  public String eEU;
  public String gPe;
  public String tRM;
  public LinkedList<String> tRN;
  
  public dm()
  {
    GMTrace.i(3820373409792L, 28464);
    this.tRN = new LinkedList();
    GMTrace.o(3820373409792L, 28464);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3820507627520L, 28465);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRM == null) {
        throw new b("Not all required fields were included: roomname");
      }
      if (this.tRM != null) {
        paramVarArgs.e(1, this.tRM);
      }
      if (this.eEU != null) {
        paramVarArgs.e(2, this.eEU);
      }
      if (this.gPe != null) {
        paramVarArgs.e(3, this.gPe);
      }
      paramVarArgs.d(4, 1, this.tRN);
      GMTrace.o(3820507627520L, 28465);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRM == null) {
        break label466;
      }
    }
    label466:
    for (int i = b.a.a.b.b.a.f(1, this.tRM) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eEU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eEU);
      }
      i = paramInt;
      if (this.gPe != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gPe);
      }
      paramInt = b.a.a.a.c(4, 1, this.tRN);
      GMTrace.o(3820507627520L, 28465);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.tRN.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tRM == null) {
          throw new b("Not all required fields were included: roomname");
        }
        GMTrace.o(3820507627520L, 28465);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        dm localdm = (dm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3820507627520L, 28465);
          return -1;
        case 1: 
          localdm.tRM = locala.yqV.readString();
          GMTrace.o(3820507627520L, 28465);
          return 0;
        case 2: 
          localdm.eEU = locala.yqV.readString();
          GMTrace.o(3820507627520L, 28465);
          return 0;
        case 3: 
          localdm.gPe = locala.yqV.readString();
          GMTrace.o(3820507627520L, 28465);
          return 0;
        }
        localdm.tRN.add(locala.yqV.readString());
        GMTrace.o(3820507627520L, 28465);
        return 0;
      }
      GMTrace.o(3820507627520L, 28465);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
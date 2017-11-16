package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bb
  extends com.tencent.mm.bm.a
{
  public String lPE;
  public String lPg;
  public bn lPv;
  public String lRS;
  public String lRT;
  public String lRU;
  
  public bb()
  {
    GMTrace.i(15199352389632L, 113244);
    GMTrace.o(15199352389632L, 113244);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15199486607360L, 113245);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.lRS != null) {
        paramVarArgs.e(2, this.lRS);
      }
      if (this.lRT != null) {
        paramVarArgs.e(3, this.lRT);
      }
      if (this.lRU != null) {
        paramVarArgs.e(4, this.lRU);
      }
      if (this.lPv != null)
      {
        paramVarArgs.fm(5, this.lPv.aYq());
        this.lPv.a(paramVarArgs);
      }
      if (this.lPE != null) {
        paramVarArgs.e(6, this.lPE);
      }
      GMTrace.o(15199486607360L, 113245);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPg != null) {
        i = b.a.a.b.b.a.f(1, this.lPg) + 0;
      }
      paramInt = i;
      if (this.lRS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRS);
      }
      i = paramInt;
      if (this.lRT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lRT);
      }
      paramInt = i;
      if (this.lRU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRU);
      }
      i = paramInt;
      if (this.lPv != null) {
        i = paramInt + b.a.a.a.fj(5, this.lPv.aYq());
      }
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lPE);
      }
      GMTrace.o(15199486607360L, 113245);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15199486607360L, 113245);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bb localbb = (bb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15199486607360L, 113245);
        return -1;
      case 1: 
        localbb.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 2: 
        localbb.lRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 3: 
        localbb.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 4: 
        localbb.lRU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbb.lPv = ((bn)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15199486607360L, 113245);
        return 0;
      }
      localbb.lPE = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(15199486607360L, 113245);
      return 0;
    }
    GMTrace.o(15199486607360L, 113245);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  public c lPb;
  public String lPc;
  public String lPd;
  
  public a()
  {
    GMTrace.i(12637538615296L, 94157);
    GMTrace.o(12637538615296L, 94157);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12637672833024L, 94158);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPc == null) {
        throw new b("Not all required fields were included: AdURL");
      }
      if (this.lPb != null)
      {
        paramVarArgs.fm(1, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      if (this.lPc != null) {
        paramVarArgs.e(2, this.lPc);
      }
      if (this.lPd != null) {
        paramVarArgs.e(3, this.lPd);
      }
      GMTrace.o(12637672833024L, 94158);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPb != null) {
        i = b.a.a.a.fj(1, this.lPb.aYq()) + 0;
      }
      paramInt = i;
      if (this.lPc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPc);
      }
      i = paramInt;
      if (this.lPd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPd);
      }
      GMTrace.o(12637672833024L, 94158);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lPc == null) {
        throw new b("Not all required fields were included: AdURL");
      }
      GMTrace.o(12637672833024L, 94158);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12637672833024L, 94158);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locala.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12637672833024L, 94158);
        return 0;
      case 2: 
        locala.lPc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12637672833024L, 94158);
        return 0;
      }
      locala.lPd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12637672833024L, 94158);
      return 0;
    }
    GMTrace.o(12637672833024L, 94158);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
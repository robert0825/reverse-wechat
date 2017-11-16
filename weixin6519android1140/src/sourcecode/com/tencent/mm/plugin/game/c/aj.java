package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class aj
  extends ayx
{
  public String gCG;
  public String lQJ;
  public int lQK;
  
  public aj()
  {
    GMTrace.i(16562064982016L, 123397);
    GMTrace.o(16562064982016L, 123397);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16562199199744L, 123398);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQJ != null) {
        paramVarArgs.e(2, this.lQJ);
      }
      if (this.gCG != null) {
        paramVarArgs.e(3, this.gCG);
      }
      paramVarArgs.fk(4, this.lQK);
      GMTrace.o(16562199199744L, 123398);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.lQJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQJ);
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gCG);
      }
      paramInt = b.a.a.a.fh(4, this.lQK);
      GMTrace.o(16562199199744L, 123398);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      GMTrace.o(16562199199744L, 123398);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aj localaj = (aj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16562199199744L, 123398);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16562199199744L, 123398);
        return 0;
      case 2: 
        localaj.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16562199199744L, 123398);
        return 0;
      case 3: 
        localaj.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16562199199744L, 123398);
        return 0;
      }
      localaj.lQK = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(16562199199744L, 123398);
      return 0;
    }
    GMTrace.o(16562199199744L, 123398);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
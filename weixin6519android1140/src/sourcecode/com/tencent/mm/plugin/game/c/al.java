package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class al
  extends ayx
{
  public String gCG;
  public String lPg;
  public String lQJ;
  public boolean lQS;
  public boolean lQT;
  public boolean lQU;
  
  public al()
  {
    GMTrace.i(12653107871744L, 94273);
    GMTrace.o(12653107871744L, 94273);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12653242089472L, 94274);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQJ != null) {
        paramVarArgs.e(2, this.lQJ);
      }
      if (this.lPg != null) {
        paramVarArgs.e(3, this.lPg);
      }
      paramVarArgs.ah(4, this.lQS);
      if (this.gCG != null) {
        paramVarArgs.e(5, this.gCG);
      }
      paramVarArgs.ah(6, this.lQT);
      paramVarArgs.ah(7, this.lQU);
      GMTrace.o(12653242089472L, 94274);
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
      if (this.lPg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPg);
      }
      i += b.a.a.b.b.a.cK(4) + 1;
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.gCG);
      }
      i = b.a.a.b.b.a.cK(6);
      int j = b.a.a.b.b.a.cK(7);
      GMTrace.o(12653242089472L, 94274);
      return paramInt + (i + 1) + (j + 1);
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
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      GMTrace.o(12653242089472L, 94274);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      al localal = (al)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12653242089472L, 94274);
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
          localal.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 2: 
        localal.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 3: 
        localal.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 4: 
        localal.lQS = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 5: 
        localal.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 6: 
        localal.lQT = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      }
      localal.lQU = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(12653242089472L, 94274);
      return 0;
    }
    GMTrace.o(12653242089472L, 94274);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
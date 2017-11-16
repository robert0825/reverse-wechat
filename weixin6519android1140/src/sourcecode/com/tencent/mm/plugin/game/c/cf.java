package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class cf
  extends ayx
{
  public String gCG;
  public String lPf;
  public String lPg;
  public boolean lPu;
  public String lQJ;
  
  public cf()
  {
    GMTrace.i(12641565147136L, 94187);
    GMTrace.o(12641565147136L, 94187);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12641699364864L, 94188);
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
      if (this.lPf != null) {
        paramVarArgs.e(4, this.lPf);
      }
      if (this.gCG != null) {
        paramVarArgs.e(5, this.gCG);
      }
      paramVarArgs.ah(6, this.lPu);
      GMTrace.o(12641699364864L, 94188);
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
      paramInt = i;
      if (this.lPf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPf);
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gCG);
      }
      paramInt = b.a.a.b.b.a.cK(6);
      GMTrace.o(12641699364864L, 94188);
      return i + (paramInt + 1);
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
      GMTrace.o(12641699364864L, 94188);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      cf localcf = (cf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12641699364864L, 94188);
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
          localcf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641699364864L, 94188);
        return 0;
      case 2: 
        localcf.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12641699364864L, 94188);
        return 0;
      case 3: 
        localcf.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12641699364864L, 94188);
        return 0;
      case 4: 
        localcf.lPf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12641699364864L, 94188);
        return 0;
      case 5: 
        localcf.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12641699364864L, 94188);
        return 0;
      }
      localcf.lPu = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(12641699364864L, 94188);
      return 0;
    }
    GMTrace.o(12641699364864L, 94188);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import java.util.LinkedList;

public final class cg
  extends azh
{
  public String eBt;
  public String lPJ;
  public boolean lPp;
  public i lSV;
  
  public cg()
  {
    GMTrace.i(12637270179840L, 94155);
    GMTrace.o(12637270179840L, 94155);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12637404397568L, 94156);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPJ == null) {
        throw new b("Not all required fields were included: Message");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.ah(2, this.lPp);
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      if (this.lPJ != null) {
        paramVarArgs.e(4, this.lPJ);
      }
      if (this.lSV != null)
      {
        paramVarArgs.fm(5, this.lSV.aYq());
        this.lSV.a(paramVarArgs);
      }
      GMTrace.o(12637404397568L, 94156);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eBt);
      }
      i = paramInt;
      if (this.lPJ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPJ);
      }
      paramInt = i;
      if (this.lSV != null) {
        paramInt = i + b.a.a.a.fj(5, this.lSV.aYq());
      }
      GMTrace.o(12637404397568L, 94156);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPJ == null) {
        throw new b("Not all required fields were included: Message");
      }
      GMTrace.o(12637404397568L, 94156);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      cg localcg = (cg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12637404397568L, 94156);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localcg.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12637404397568L, 94156);
        return 0;
      case 2: 
        localcg.lPp = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12637404397568L, 94156);
        return 0;
      case 3: 
        localcg.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12637404397568L, 94156);
        return 0;
      case 4: 
        localcg.lPJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12637404397568L, 94156);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new i();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localcg.lSV = ((i)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12637404397568L, 94156);
      return 0;
    }
    GMTrace.o(12637404397568L, 94156);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
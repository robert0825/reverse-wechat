package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mc
  extends azh
{
  public String ucK;
  public String ucL;
  public int ucS;
  public long ucT;
  
  public mc()
  {
    GMTrace.i(3779705438208L, 28161);
    GMTrace.o(3779705438208L, 28161);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3779839655936L, 28162);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.ucS);
      if (this.ucK != null) {
        paramVarArgs.e(3, this.ucK);
      }
      if (this.ucL != null) {
        paramVarArgs.e(4, this.ucL);
      }
      paramVarArgs.T(5, this.ucT);
      GMTrace.o(3779839655936L, 28162);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.ucS);
      paramInt = i;
      if (this.ucK != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ucK);
      }
      i = paramInt;
      if (this.ucL != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.ucL);
      }
      paramInt = b.a.a.a.S(5, this.ucT);
      GMTrace.o(3779839655936L, 28162);
      return i + paramInt;
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
      GMTrace.o(3779839655936L, 28162);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mc localmc = (mc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3779839655936L, 28162);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localmc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3779839655936L, 28162);
        return 0;
      case 2: 
        localmc.ucS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3779839655936L, 28162);
        return 0;
      case 3: 
        localmc.ucK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3779839655936L, 28162);
        return 0;
      case 4: 
        localmc.ucL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3779839655936L, 28162);
        return 0;
      }
      localmc.ucT = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3779839655936L, 28162);
      return 0;
    }
    GMTrace.o(3779839655936L, 28162);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\mc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
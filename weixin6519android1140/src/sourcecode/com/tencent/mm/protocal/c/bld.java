package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bld
  extends azh
{
  public String uEs;
  public int upO;
  public int upP;
  public int upQ;
  public int upR;
  public String upS;
  public int upT;
  
  public bld()
  {
    GMTrace.i(3710717526016L, 27647);
    GMTrace.o(3710717526016L, 27647);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3710851743744L, 27648);
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
      if (this.uEs != null) {
        paramVarArgs.e(2, this.uEs);
      }
      if (this.upS != null) {
        paramVarArgs.e(3, this.upS);
      }
      paramVarArgs.fk(4, this.upR);
      paramVarArgs.fk(5, this.upO);
      paramVarArgs.fk(6, this.upP);
      paramVarArgs.fk(7, this.upQ);
      paramVarArgs.fk(8, this.upT);
      GMTrace.o(3710851743744L, 27648);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uEs != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uEs);
      }
      i = paramInt;
      if (this.upS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.upS);
      }
      paramInt = b.a.a.a.fh(4, this.upR);
      int j = b.a.a.a.fh(5, this.upO);
      int k = b.a.a.a.fh(6, this.upP);
      int m = b.a.a.a.fh(7, this.upQ);
      int n = b.a.a.a.fh(8, this.upT);
      GMTrace.o(3710851743744L, 27648);
      return i + paramInt + j + k + m + n;
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
      GMTrace.o(3710851743744L, 27648);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bld localbld = (bld)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3710851743744L, 27648);
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
          localbld.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3710851743744L, 27648);
        return 0;
      case 2: 
        localbld.uEs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3710851743744L, 27648);
        return 0;
      case 3: 
        localbld.upS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3710851743744L, 27648);
        return 0;
      case 4: 
        localbld.upR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3710851743744L, 27648);
        return 0;
      case 5: 
        localbld.upO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3710851743744L, 27648);
        return 0;
      case 6: 
        localbld.upP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3710851743744L, 27648);
        return 0;
      case 7: 
        localbld.upQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3710851743744L, 27648);
        return 0;
      }
      localbld.upT = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3710851743744L, 27648);
      return 0;
    }
    GMTrace.o(3710851743744L, 27648);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
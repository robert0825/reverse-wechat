package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ho
  extends azh
{
  public int jib;
  public int tTL;
  public int tWr;
  public int tWv;
  public String tWx;
  public float tWy;
  public float tWz;
  
  public ho()
  {
    GMTrace.i(3712596574208L, 27661);
    GMTrace.o(3712596574208L, 27661);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3712730791936L, 27662);
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
      paramVarArgs.fk(2, this.tWr);
      paramVarArgs.fk(3, this.jib);
      if (this.tWx != null) {
        paramVarArgs.e(4, this.tWx);
      }
      paramVarArgs.fk(5, this.tTL);
      paramVarArgs.fk(6, this.tWv);
      paramVarArgs.n(7, this.tWy);
      paramVarArgs.n(8, this.tWz);
      GMTrace.o(3712730791936L, 27662);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tWr) + b.a.a.a.fh(3, this.jib);
      paramInt = i;
      if (this.tWx != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWx);
      }
      i = b.a.a.a.fh(5, this.tTL);
      int j = b.a.a.a.fh(6, this.tWv);
      int k = b.a.a.b.b.a.cK(7);
      int m = b.a.a.b.b.a.cK(8);
      GMTrace.o(3712730791936L, 27662);
      return paramInt + i + j + (k + 4) + (m + 4);
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
      GMTrace.o(3712730791936L, 27662);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ho localho = (ho)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3712730791936L, 27662);
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
          localho.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3712730791936L, 27662);
        return 0;
      case 2: 
        localho.tWr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712730791936L, 27662);
        return 0;
      case 3: 
        localho.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712730791936L, 27662);
        return 0;
      case 4: 
        localho.tWx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712730791936L, 27662);
        return 0;
      case 5: 
        localho.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712730791936L, 27662);
        return 0;
      case 6: 
        localho.tWv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712730791936L, 27662);
        return 0;
      case 7: 
        localho.tWy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3712730791936L, 27662);
        return 0;
      }
      localho.tWz = ((b.a.a.a.a)localObject1).yqV.readFloat();
      GMTrace.o(3712730791936L, 27662);
      return 0;
    }
    GMTrace.o(3712730791936L, 27662);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
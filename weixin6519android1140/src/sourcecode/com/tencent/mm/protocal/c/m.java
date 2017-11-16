package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class m
  extends azh
{
  public String jWE;
  public String jWF;
  public int jWs;
  public String jWt;
  public int tMn;
  public int tMo;
  public int tMp;
  public long tMq;
  public long tMr;
  
  public m()
  {
    GMTrace.i(3858357026816L, 28747);
    this.jWs = 268513600;
    this.jWt = "请求不成功，请稍候再试";
    GMTrace.o(3858357026816L, 28747);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3858491244544L, 28748);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      paramVarArgs.fk(4, this.tMn);
      paramVarArgs.fk(5, this.tMo);
      paramVarArgs.fk(6, this.tMp);
      paramVarArgs.T(7, this.tMq);
      paramVarArgs.T(8, this.tMr);
      if (this.jWE != null) {
        paramVarArgs.e(9, this.jWE);
      }
      if (this.jWF != null) {
        paramVarArgs.e(10, this.jWF);
      }
      GMTrace.o(3858491244544L, 28748);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt + b.a.a.a.fh(4, this.tMn) + b.a.a.a.fh(5, this.tMo) + b.a.a.a.fh(6, this.tMp) + b.a.a.a.S(7, this.tMq) + b.a.a.a.S(8, this.tMr);
      paramInt = i;
      if (this.jWE != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jWE);
      }
      i = paramInt;
      if (this.jWF != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.jWF);
      }
      GMTrace.o(3858491244544L, 28748);
      return i;
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
      GMTrace.o(3858491244544L, 28748);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3858491244544L, 28748);
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
          localm.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 2: 
        localm.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 3: 
        localm.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 4: 
        localm.tMn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 5: 
        localm.tMo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 6: 
        localm.tMp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 7: 
        localm.tMq = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 8: 
        localm.tMr = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      case 9: 
        localm.jWE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3858491244544L, 28748);
        return 0;
      }
      localm.jWF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3858491244544L, 28748);
      return 0;
    }
    GMTrace.o(3858491244544L, 28748);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class x
  extends azh
{
  public int jWs;
  public String jWt;
  public String tMN;
  public int tMO;
  public int tMP;
  public String tMQ;
  public LinkedList<k> tMR;
  public String tMS;
  
  public x()
  {
    GMTrace.i(4004654350336L, 29837);
    this.jWs = 268513600;
    this.jWt = "请求不成功，请稍候再试";
    this.tMR = new LinkedList();
    GMTrace.o(4004654350336L, 29837);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4004788568064L, 29838);
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
      paramVarArgs.d(4, 8, this.tMR);
      if (this.tMS != null) {
        paramVarArgs.e(5, this.tMS);
      }
      if (this.tMN != null) {
        paramVarArgs.e(6, this.tMN);
      }
      paramVarArgs.fk(7, this.tMO);
      paramVarArgs.fk(8, this.tMP);
      if (this.tMQ != null) {
        paramVarArgs.e(9, this.tMQ);
      }
      GMTrace.o(4004788568064L, 29838);
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
      i = paramInt + b.a.a.a.c(4, 8, this.tMR);
      paramInt = i;
      if (this.tMS != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tMS);
      }
      i = paramInt;
      if (this.tMN != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tMN);
      }
      i = i + b.a.a.a.fh(7, this.tMO) + b.a.a.a.fh(8, this.tMP);
      paramInt = i;
      if (this.tMQ != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tMQ);
      }
      GMTrace.o(4004788568064L, 29838);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tMR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4004788568064L, 29838);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      x localx = (x)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4004788568064L, 29838);
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
          localx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 2: 
        localx.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 3: 
        localx.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localx.tMR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 5: 
        localx.tMS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 6: 
        localx.tMN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 7: 
        localx.tMO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4004788568064L, 29838);
        return 0;
      case 8: 
        localx.tMP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4004788568064L, 29838);
        return 0;
      }
      localx.tMQ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4004788568064L, 29838);
      return 0;
    }
    GMTrace.o(4004788568064L, 29838);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
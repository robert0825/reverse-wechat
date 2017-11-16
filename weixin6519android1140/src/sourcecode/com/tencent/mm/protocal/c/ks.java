package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ks
  extends azh
{
  public String eJQ;
  public int jWs;
  public String jWt;
  public int mFu;
  public String tXd;
  public String ubn;
  public String ubo;
  public String ubq;
  public String uby;
  
  public ks()
  {
    GMTrace.i(19137568964608L, 142586);
    GMTrace.o(19137568964608L, 142586);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19137703182336L, 142587);
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
      if (this.eJQ != null) {
        paramVarArgs.e(4, this.eJQ);
      }
      if (this.ubq != null) {
        paramVarArgs.e(5, this.ubq);
      }
      if (this.tXd != null) {
        paramVarArgs.e(6, this.tXd);
      }
      paramVarArgs.fk(7, this.mFu);
      if (this.uby != null) {
        paramVarArgs.e(8, this.uby);
      }
      if (this.ubo != null) {
        paramVarArgs.e(9, this.ubo);
      }
      if (this.ubn != null) {
        paramVarArgs.e(10, this.ubn);
      }
      GMTrace.o(19137703182336L, 142587);
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
      i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.eJQ);
      }
      paramInt = i;
      if (this.ubq != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ubq);
      }
      i = paramInt;
      if (this.tXd != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tXd);
      }
      i += b.a.a.a.fh(7, this.mFu);
      paramInt = i;
      if (this.uby != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uby);
      }
      i = paramInt;
      if (this.ubo != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ubo);
      }
      paramInt = i;
      if (this.ubn != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ubn);
      }
      GMTrace.o(19137703182336L, 142587);
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
      GMTrace.o(19137703182336L, 142587);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ks localks = (ks)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19137703182336L, 142587);
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
          localks.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 2: 
        localks.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 3: 
        localks.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 4: 
        localks.eJQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 5: 
        localks.ubq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 6: 
        localks.tXd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 7: 
        localks.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 8: 
        localks.uby = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      case 9: 
        localks.ubo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137703182336L, 142587);
        return 0;
      }
      localks.ubn = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19137703182336L, 142587);
      return 0;
    }
    GMTrace.o(19137703182336L, 142587);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
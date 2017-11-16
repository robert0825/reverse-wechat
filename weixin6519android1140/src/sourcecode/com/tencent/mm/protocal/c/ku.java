package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ku
  extends azh
{
  public String desc;
  public int jWs;
  public String jWt;
  public String omt;
  public LinkedList<Integer> ubb;
  public int ubd;
  public String ubo;
  public String ubr;
  public String ubu;
  public String ubw;
  public String ubx;
  public String ubz;
  
  public ku()
  {
    GMTrace.i(19138105835520L, 142590);
    this.ubb = new LinkedList();
    GMTrace.o(19138105835520L, 142590);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19138240053248L, 142591);
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
      if (this.ubr != null) {
        paramVarArgs.e(4, this.ubr);
      }
      paramVarArgs.d(5, 2, this.ubb);
      if (this.desc != null) {
        paramVarArgs.e(6, this.desc);
      }
      if (this.ubz != null) {
        paramVarArgs.e(7, this.ubz);
      }
      if (this.omt != null) {
        paramVarArgs.e(8, this.omt);
      }
      if (this.ubu != null) {
        paramVarArgs.e(9, this.ubu);
      }
      if (this.ubw != null) {
        paramVarArgs.e(10, this.ubw);
      }
      if (this.ubx != null) {
        paramVarArgs.e(11, this.ubx);
      }
      paramVarArgs.fk(12, this.ubd);
      if (this.ubo != null) {
        paramVarArgs.e(13, this.ubo);
      }
      GMTrace.o(19138240053248L, 142591);
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
      if (this.ubr != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.ubr);
      }
      i += b.a.a.a.c(5, 2, this.ubb);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.desc);
      }
      i = paramInt;
      if (this.ubz != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ubz);
      }
      paramInt = i;
      if (this.omt != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.omt);
      }
      i = paramInt;
      if (this.ubu != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ubu);
      }
      paramInt = i;
      if (this.ubw != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ubw);
      }
      i = paramInt;
      if (this.ubx != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.ubx);
      }
      i += b.a.a.a.fh(12, this.ubd);
      paramInt = i;
      if (this.ubo != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.ubo);
      }
      GMTrace.o(19138240053248L, 142591);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ubb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19138240053248L, 142591);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ku localku = (ku)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19138240053248L, 142591);
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
          localku.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 2: 
        localku.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 3: 
        localku.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 4: 
        localku.ubr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 5: 
        localku.ubb.add(Integer.valueOf(((b.a.a.a.a)localObject1).yqV.nj()));
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 6: 
        localku.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 7: 
        localku.ubz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 8: 
        localku.omt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 9: 
        localku.ubu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 10: 
        localku.ubw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 11: 
        localku.ubx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      case 12: 
        localku.ubd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19138240053248L, 142591);
        return 0;
      }
      localku.ubo = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19138240053248L, 142591);
      return 0;
    }
    GMTrace.o(19138240053248L, 142591);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
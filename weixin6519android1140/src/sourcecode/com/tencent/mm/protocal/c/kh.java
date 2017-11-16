package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kh
  extends azh
{
  public String desc;
  public int jWs;
  public String jWt;
  public String jvD;
  public String jzt;
  public String ree;
  public boolean uaX;
  public String uaY;
  public String uaZ;
  public int uba;
  public LinkedList<Integer> ubb;
  public String ubc;
  public int ubd;
  public int ube;
  
  public kh()
  {
    GMTrace.i(19139984883712L, 142604);
    this.ubb = new LinkedList();
    GMTrace.o(19139984883712L, 142604);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19140119101440L, 142605);
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
      paramVarArgs.ah(4, this.uaX);
      if (this.uaY != null) {
        paramVarArgs.e(5, this.uaY);
      }
      if (this.uaZ != null) {
        paramVarArgs.e(6, this.uaZ);
      }
      if (this.jvD != null) {
        paramVarArgs.e(7, this.jvD);
      }
      paramVarArgs.fk(8, this.uba);
      if (this.desc != null) {
        paramVarArgs.e(9, this.desc);
      }
      if (this.ree != null) {
        paramVarArgs.e(10, this.ree);
      }
      paramVarArgs.d(11, 2, this.ubb);
      if (this.ubc != null) {
        paramVarArgs.e(12, this.ubc);
      }
      if (this.jzt != null) {
        paramVarArgs.e(13, this.jzt);
      }
      paramVarArgs.fk(14, this.ubd);
      paramVarArgs.fk(15, this.ube);
      GMTrace.o(19140119101440L, 142605);
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
      i = paramInt + (b.a.a.b.b.a.cK(4) + 1);
      paramInt = i;
      if (this.uaY != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uaY);
      }
      i = paramInt;
      if (this.uaZ != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uaZ);
      }
      paramInt = i;
      if (this.jvD != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.jvD);
      }
      i = paramInt + b.a.a.a.fh(8, this.uba);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.desc);
      }
      i = paramInt;
      if (this.ree != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.ree);
      }
      i += b.a.a.a.c(11, 2, this.ubb);
      paramInt = i;
      if (this.ubc != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.ubc);
      }
      i = paramInt;
      if (this.jzt != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.jzt);
      }
      paramInt = b.a.a.a.fh(14, this.ubd);
      int j = b.a.a.a.fh(15, this.ube);
      GMTrace.o(19140119101440L, 142605);
      return i + paramInt + j;
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
      GMTrace.o(19140119101440L, 142605);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kh localkh = (kh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19140119101440L, 142605);
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
          localkh.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 2: 
        localkh.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 3: 
        localkh.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 4: 
        localkh.uaX = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 5: 
        localkh.uaY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 6: 
        localkh.uaZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 7: 
        localkh.jvD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 8: 
        localkh.uba = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 9: 
        localkh.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 10: 
        localkh.ree = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 11: 
        localkh.ubb.add(Integer.valueOf(((b.a.a.a.a)localObject1).yqV.nj()));
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 12: 
        localkh.ubc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 13: 
        localkh.jzt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      case 14: 
        localkh.ubd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19140119101440L, 142605);
        return 0;
      }
      localkh.ube = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(19140119101440L, 142605);
      return 0;
    }
    GMTrace.o(19140119101440L, 142605);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\kh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
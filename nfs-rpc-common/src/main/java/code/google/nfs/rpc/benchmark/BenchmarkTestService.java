/**
 * nfs-rpc
 *   Apache License
 *   
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */
package code.google.nfs.rpc.benchmark;
/**
 * Just for Reflection RPC Benchmark
 * 
 * @author <a href="mailto:bluedavy@gmail.com">bluedavy</a>
 */
public interface BenchmarkTestService {

	public ResponseObject execute(RequestObject request);
	
}
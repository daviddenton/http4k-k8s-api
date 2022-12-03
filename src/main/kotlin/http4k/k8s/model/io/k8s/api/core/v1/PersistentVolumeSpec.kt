package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class PersistentVolumeSpec(
	val accessModes: List<String>?,
	val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource?,
	val azureDisk: AzureDiskVolumeSource?,
	val azureFile: AzureFilePersistentVolumeSource?,
	val capacity: Map<String, Any>?,
	val cephfs: CephFSPersistentVolumeSource?,
	val cinder: CinderPersistentVolumeSource?,
	val claimRef: ObjectReference?,
	val csi: CSIPersistentVolumeSource?,
	val fc: FCVolumeSource?,
	val flexVolume: FlexPersistentVolumeSource?,
	val flocker: FlockerVolumeSource?,
	val gcePersistentDisk: GCEPersistentDiskVolumeSource?,
	val glusterfs: GlusterfsPersistentVolumeSource?,
	val hostPath: HostPathVolumeSource?,
	val iscsi: ISCSIPersistentVolumeSource?,
	val local: LocalVolumeSource?,
	val mountOptions: List<String>?,
	val nfs: NFSVolumeSource?,
	val nodeAffinity: VolumeNodeAffinity?,
	val persistentVolumeReclaimPolicy: String?,
	val photonPersistentDisk: PhotonPersistentDiskVolumeSource?,
	val portworxVolume: PortworxVolumeSource?,
	val quobyte: QuobyteVolumeSource?,
	val rbd: RBDPersistentVolumeSource?,
	val scaleIO: ScaleIOPersistentVolumeSource?,
	val storageClassName: String?,
	val storageos: StorageOSPersistentVolumeSource?,
	val volumeMode: String?,
	val vsphereVolume: VsphereVirtualDiskVolumeSource?
)